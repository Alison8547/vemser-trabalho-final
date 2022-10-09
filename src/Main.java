import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    static VooManipulacao vooManipulacao = new VooManipulacao();
    static ClienteManipulacao clienteManipulacao = new ClienteManipulacao();
    static CompanhiaManipulacao companhiaManipulacao = new CompanhiaManipulacao();
    static Scanner scan1 = new Scanner(System.in);

    static int valorDigitado() {
        Scanner scan = new Scanner(System.in);
        int valor;
        try{
            valor = scan.nextInt();
            scan.nextLine();
        }catch (InputMismatchException i){
            System.out.println("Erro, Não foi informado um número válido");
            valor = -1;
        }
        return valor;
    }

    public static void menuInicial() throws ParseException {
        System.out.println("********** Bem vindo ao sistema de passagens aéreas Varig **********");
        System.out.println("Digite [1] para entrar na pagina de Clientes\nDigite [2] para entrar na página de Companhias\nDigite [0] para sair");
        switch (valorDigitado()){
            case 0 -> System.err.println("Você saiu do sistema!");
            case 1 -> menuCliente();
            case 2 -> menuTodasCompanhias();
            default -> {
                System.err.println("Opção inválida, tente novamente!");
                menuInicial();
            }
        }
    }
    private static void menuCliente() throws ParseException {
        System.out.println("\n********** Bem vindo a area de Clientes **********");
        option();
        EnumSet
                .allOf(MenuClienteGeralEnum.class)
                .forEach(value -> System.out.println(value.getDescricao()));
        switch (valorDigitado()){
            case 0 -> menuInicial();
            case 1 -> {
                Cliente cliente = new Cliente();
                System.out.println("Digite seu nome: ");
                cliente.setNome(scan1.nextLine());
                System.out.println("Digite sua idade: ");
                cliente.setIdade(valorDigitado());
                System.out.println("Digite seu cpf: ");
                cliente.setCpf(scan1.nextLine());
                System.out.println("Digite seu email: ");
                cliente.setEmail(scan1.nextLine());
                System.out.println("Digite seu telefone: ");
                cliente.setTelefone(scan1.nextLine());
                clienteManipulacao.createList(cliente);
                menuCliente();
            }
            case 2 -> {
                clienteManipulacao.listar();
                menuCliente();
            }
            case 3 -> {
                clienteManipulacao.listar();
                System.out.println("Qual cliente você quer buscar pelo seu id ?");
                System.out.println(clienteManipulacao.readList(valorDigitado()));
                menuCliente();
            }
            case 4 -> {
                System.out.println("Qual cliente você quer editar ?");
                clienteManipulacao.listar();
                System.out.println("Digite seu id: ");
                int index = valorDigitado();
                Cliente cliente = new Cliente();
                System.out.println("Digite seu nome: ");
                cliente.setNome(scan1.nextLine());
                System.out.println("Digite sua idade: ");
                cliente.setIdade(scan1.nextInt());
                scan1.nextLine();
                System.out.println("Digite seu email: ");
                cliente.setEmail(scan1.nextLine());
                System.out.println("Digite seu telefone: ");
                cliente.setTelefone(scan1.nextLine());
                clienteManipulacao.updateList(index, cliente);
                menuCliente();
            }
            case 5 -> {
                System.out.println("Qual cliente você deseja excluir ?");
                clienteManipulacao.listar();
                System.out.println("Digite o id dele: ");
                int index = valorDigitado();
                clienteManipulacao.deleteList(index);
                menuCliente();
            }
            default -> {
                System.err.println("Opção inválida!");
                menuCliente();
            }
        }
    }

    static void buscaVooCompanhia(String companhia) {
        vooManipulacao.getListVoos().stream()
                .filter(voo -> voo.getCompanhia().contains(companhia))
                .forEach(System.out::println);
    }

    private static void   option(){
        System.out.println("Escolha uma opção para continuar:");
    }

    public static void menuTodasCompanhias() throws ParseException {
        System.out.println("\n**********Bem vindo a area de Companhias **********");
        option();
        EnumSet
                .allOf(MenuCompanhiaGeralEnum.class)
                .forEach(value -> System.out.println(value.getDescricao()));
        switch (valorDigitado()){
            case 0 -> menuInicial();
            case 1 -> {
                companhiaManipulacao.listar();
                menuTodasCompanhias();
            }
            case 2 -> {
                System.out.println("Digite o nome da companhia");
                String nome = scan1.nextLine();
                CompanhiaAerea companhiaAerea = new CompanhiaAerea(nome);
                companhiaManipulacao.createList(companhiaAerea);
                System.out.println("Companhia criada com sucesso");
                menuTodasCompanhias();

            }
            case 3 -> {
                companhiaManipulacao.listar();
                System.out.println("Digite o index da companhia que deseja selecionar:");
                int index = valorDigitado();
                menuCompanhia((CompanhiaAerea) companhiaManipulacao.readList(index));
            }
            case 4 -> {
                companhiaManipulacao.listar();
                System.out.println("Digite o index da companhia que deseja editar:");
                int index = valorDigitado();
                System.out.println("Digite o novo nome:");
                String novoNome = scan1.nextLine();
                CompanhiaAerea companhiaTeste = new CompanhiaAerea(novoNome);
                companhiaManipulacao.updateList(index,companhiaTeste);
            }
            case 5 -> {
                System.out.println("Digite o index da companhia que deseja deletar:");
                int index = valorDigitado();
                companhiaManipulacao.deleteList(index);
                System.out.println("Companhia deletada com sucesso");
                menuTodasCompanhias();
            }
            default -> {
                System.err.println("Opção inválida!");
                menuTodasCompanhias();
            }
        }
    }

    static void menuCompanhia(CompanhiaAerea companhia) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("\nBem vindo ao menu da companhia "+companhia.getNome());
        option();
        EnumSet
                .allOf(MenuCompanhiaEnum.class)
                .forEach(value -> System.out.println(value.getDescricao()));
        switch (valorDigitado()){
            case 0 -> menuTodasCompanhias();
            case 1 -> {
                Voo voo = new Voo();
                voo.setPassageiros(null);
                voo.setCompanhia(companhia.getNome());
                System.out.println("Digite a data de partida: ");
                Date date = sdf.parse(scan1.nextLine());
                voo.setDataPartida(date);
                System.out.println("Digite a data de chegada: ");
                date = sdf.parse(scan1.nextLine());
                voo.setDataChegada(date);
                System.out.println("Digite o Local de partida: ");
                voo.setLocalPartida(scan1.nextLine());
                System.out.println("Digite o Local de chegada: ");
                voo.setLocalChegada(scan1.nextLine());
                System.out.println("Digite o preço da passagem: ");
                voo.setPrecoPassagem(scan1.nextDouble());
                vooManipulacao.createList(voo);
                menuCompanhia(companhia);
            }
            case 2 -> {
                buscaVooCompanhia(companhia.getNome());
                menuCompanhia(companhia);
            }
            case 3 -> {
                System.out.println("Digite o index do voo que voce deseja editar:");
                vooManipulacao.listar();
                int index = valorDigitado();
                Voo voo = new Voo();
                voo.setPassageiros(null);
                voo.setCompanhia(companhia.getNome());
                System.out.println("Digite a data de partida: ");
                Date date = sdf.parse(scan1.nextLine());
                voo.setDataPartida(date);
                System.out.println("Digite a data de chegada: ");
                date = sdf.parse(scan1.nextLine());
                voo.setDataChegada(date);
                System.out.println("Digite o Local de partida: ");
                voo.setLocalPartida(scan1.nextLine());
                System.out.println("Digite o Local de chegada: ");
                voo.setLocalChegada(scan1.nextLine());
                System.out.println("Digite o preço da passagem: ");
                voo.setPrecoPassagem(scan1.nextDouble());
                vooManipulacao.updateList(index,voo);
            }
            case 4 -> {
                System.out.println("Digite o index do voo que você deseja cancelar:");
                vooManipulacao.listar();
                int index = valorDigitado();
                vooManipulacao.deleteList(index);
            }
            case 5 -> {
                companhia.imprimir();
                menuCompanhia(companhia);
            }
            default -> {
                System.err.println("Opção inválida!");
                menuCompanhia(companhia);
            }
        }
    }
    public static void main(String[] args) throws ParseException, FormatoErradoDataException {
        clienteManipulacao.createList(new Cliente("Rafa",22, "076.961.456-98", "rafatestvarig@gmail.com", "(71)99134-3542"));
        clienteManipulacao.createList(new Cliente("Kevin",25, "035.751.450-68", "kevintestvarig@gmail.com", "(21)99184-1234"));
        clienteManipulacao.createList(new Cliente("Carol",30, "065.456.588-06", "caroltestvarig@gmail.com", "(91)99976-1314"));
        companhiaManipulacao.createList(new CompanhiaAerea("Varig"));
        companhiaManipulacao.createList(new CompanhiaAerea("Tam"));
        companhiaManipulacao.createList(new CompanhiaAerea("Gol"));
        companhiaManipulacao.createList(new CompanhiaAerea("Azul"));
        Menus.menuInicial(false);
    }
}