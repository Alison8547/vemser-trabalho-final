import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.EnumSet;
import java.util.Scanner;

public class Menus {
    static ClienteManipulacao clienteManipulacao = new ClienteManipulacao();
    static CompanhiaManipulacao companhiaManipulacao = new CompanhiaManipulacao();
    static Scanner scan1 = new Scanner(System.in);

    static int valorDigitado(){
        Scanner scan = new Scanner(System.in);
        int valor = scan.nextInt();
        scan.nextLine();
        return valor;
    }

    public static void menuInicial() throws ParseException {
        System.out.println("Olá, bem vindo ao sistema de passagens aéreas Varig");
        System.out.println("Digite 1 para entrar ná pagina de clientes," +
                " 2 para entrar na página de Companhias ou 0 para sair");
        switch (valorDigitado()){
            case 0 -> System.out.println("Adeus");
            case 1 -> menuCliente();
            case 2 -> menuTodasCompanhias();
        }
    }
    private static void menuCliente() throws ParseException {
        System.out.println("\nBem vindo a area de Clientes");
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
            }
        }
    }

    private static void   option(){
        System.out.println("Escolha uma opção para continuar:");
    }

    public static void menuTodasCompanhias() throws ParseException {
        System.out.println("\nBem vindo a area de Companhias");
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
                Menus.menuTodasCompanhias();

            }
            case 3 -> {
                companhiaManipulacao.listar();
                System.out.println("Digite o index da companhia que deseja selecionar:");
                int index = Menus.valorDigitado();
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
                int index = Menus.valorDigitado();
                companhiaManipulacao.deleteList(index);
                System.out.println("Companhia deletada com sucesso");
                Menus.menuTodasCompanhias();
            }
        }
    }

    static void menuCompanhia(CompanhiaAerea companhia) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("\n Bem vindo ao menu da companhia "+companhia.getNome());
        option();
        EnumSet
                .allOf(MenuCompanhiaEnum.class)
                .forEach(value -> System.out.println(value.getDescricao()));
        switch (valorDigitado()){
            case 0 -> menuTodasCompanhias();
            case 1 -> {
                Voo voo = new Voo();
                voo.setPassageiros(null);
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
                companhia.getVoos().add(voo);
                menuCompanhia(companhia);
            }
            case 2 -> {

            }
            case 6 -> {
                companhia.imprimir();
                menuCompanhia(companhia);
            }
        }
    }
}
