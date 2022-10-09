import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Menus {
    static VooManipulacao vooManipulacao = new VooManipulacao();
    static ClienteManipulacao clienteManipulacao = new ClienteManipulacao();
    static CompanhiaManipulacao companhiaManipulacao = new CompanhiaManipulacao();
    static Scanner scan1 = new Scanner(System.in);
    static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    //Cliente
    static Cliente cliente1 = new Cliente("Pietro",26,"00566783045","pietro.bianchi@dbccompany.br","994668885");
    static Cliente cliente2 = new Cliente("Alison",24,"9999999999","alison.silva@dbccompany.br","6666666666");
    static Cliente cliente3 = new Cliente("Kevin",25,"88888888888","kevin.aryel@dbccompany.br","77777777777");
    static Cliente cliente4 = new Cliente("Maicon",31,"11111111111","maicon.gerardi@dbccompany.br","5555555555");
    static Cliente cliente5 = new Cliente("Ricardo",27,"2222222222","ricador.langbecker@dbccompany.br","4444444444");
    static Cliente cliente6 = new Cliente("Gaby",24,"3333333333","gaby.freitas@dbccompany.br","33333333333");
    static Cliente cliente7 = new Cliente("Felipe",26,"4444444444","felipe.noguez@dbccompany.br","888888888");
    static Cliente cliente8 = new Cliente("Lucas",26,"0000000000","lucas.pereira@dbccompany.br","000000000");

    //Voo
    static Voo voo1;

    static {
        try {
            voo1 = new Voo(List.of(cliente1, cliente3),"Gol",(sdf.parse("10/10/2022")),(sdf.parse("12/10/2022")),"Porto Alegre/RS/BR","Montivideo/UY", 350.50);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    static Voo voo2;

    static {
        try {
            voo2 = new Voo(List.of(cliente8, cliente5, cliente6, cliente2),"Emirates Airlines",sdf.parse("17/10/2022"),sdf.parse("22/10/2022"),"Porto Alegre/RS/BR","Dubai/EM", 33350.50);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    static Voo voo3;

    static {
        try {
            voo3 = new Voo(List.of(cliente1, cliente5, cliente4, cliente7),"Tam",sdf.parse("15/10/2022"),sdf.parse("15/10/2022"),"Porto Alegre/RS/BR","Rio de Janeiro/RJ/BR", 250.90);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    static Voo voo4;

    static {
        try {
            voo4 = new Voo(null,"Azul",(sdf.parse("23/12/2022")),sdf.parse("27/12/2022"),"Porto Alegre/RS/BR","Natal/RN/BR", 490.68);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    static Voo voo5;

    static {
        try {
            voo5 = new Voo(null,"Azul",sdf.parse("11/11/2022"),sdf.parse("12/11/2022"),"Porto Alegre/RS/BR","São Paulo/SP/BR", 325.37);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }


    static Voo voo6;

    static {
        try {
            voo6 = new Voo(List.of(cliente8, cliente5, cliente6, cliente2),"Emirates Airlines",sdf.parse("13/12/2022"),sdf.parse("17/12/2022"),"Dubai/EM","Porto Alegre/RS/BR", 27350.50);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    static Voo voo7;

    static {
        try {
            voo7 = new Voo(null,"Tam",sdf.parse("11/11/2022"),sdf.parse("12/11/2022"),"Porto Alegre/RS/BR","São Paulo/SP/BR", 400.37);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    static Voo voo8;

    static {
        try {
            voo8 = new Voo(null,"Gol",sdf.parse("11/11/2022"),sdf.parse("12/11/2022"),"Porto Alegre/RS/BR","São Paulo/SP/BR", 368.37);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    //CompanhiaAerea
    static CompanhiaAerea companhiaAerea1 = new CompanhiaAerea("Gol");
    static CompanhiaAerea companhiaAerea2 = new CompanhiaAerea("Tam");
    static CompanhiaAerea companhiaAerea3 = new CompanhiaAerea("Azul");
    static CompanhiaAerea companhiaAerea4 = new CompanhiaAerea("Emirates Airlines");

    public Menus() throws ParseException {
    }

    static int valorDigitado() {
        Scanner scan = new Scanner(System.in);
        int valor;
        try{
            valor = scan.nextInt();
            scan.nextLine();
        }catch (InputMismatchException i){
            valor = -1;
        }
        return valor;
    }

    public static void menuInicial(boolean test) throws ParseException {
        if (test == false){
            clienteManipulacao.createList(cliente1);
            clienteManipulacao.createList(cliente2);
            clienteManipulacao.createList(cliente3);
            clienteManipulacao.createList(cliente4);
            clienteManipulacao.createList(cliente5);
            clienteManipulacao.createList(cliente6);
            clienteManipulacao.createList(cliente7);
            clienteManipulacao.createList(cliente8);
            companhiaManipulacao.createList(companhiaAerea1);
            companhiaManipulacao.createList(companhiaAerea2);
            companhiaManipulacao.createList(companhiaAerea3);
            companhiaManipulacao.createList(companhiaAerea4);
            vooManipulacao.createList(voo1);
            vooManipulacao.createList(voo2);
            vooManipulacao.createList(voo3);
            vooManipulacao.createList(voo4);
            vooManipulacao.createList(voo5);
            vooManipulacao.createList(voo6);
            vooManipulacao.createList(voo7);
            vooManipulacao.createList(voo8);
        test = true;}
        System.out.println("********** Bem vindo ao sistema de passagens aéreas Varig **********");
        System.out.println("Digite [1] para entrar na pagina de Clientes\nDigite [2] para entrar na página de Companhias\nDigite [0] para sair");
        switch (valorDigitado()){
            case 0 -> System.err.println("Você saiu do sistema!");
            case 1 -> menuCliente();
            case 2 -> menuTodasCompanhias();
            default -> {
                System.out.println("Opção inválida\nTente novamente\n");
                menuInicial(false);
            }
        }
    }
    private static void menuCliente() throws ParseException {
        System.out.println("\nBem vindo a area de Clientes");
        option();
        EnumSet
                .allOf(MenuClienteGeralEnum.class)
                .forEach(value -> System.out.println(value.getDescricao()));
        switch (valorDigitado()){
            case 0 -> menuInicial(true);
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
//                System.out.println(clienteManipulacao.readList(valorDigitado()));
                menuClienteSelecionado((Cliente) clienteManipulacao.readList(valorDigitado()));
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
                System.err.println("Opção inválida!\nTente novamente\n");
                menuCliente();
            }
        }
    }

    public static void menuClienteSelecionado(Cliente cliente) throws ParseException {
        System.out.println("\n Bem vindo ao menu do cliente "+cliente.getNome());
        EnumSet
                .allOf(MenuClienteEnum.class)
                .forEach(value -> System.out.println(value.getDescricao()));
        switch (valorDigitado()){
            case 1 -> {procuraPassagem();menuCliente();}//COMPRA
            case 2 -> {System.err.println("OPCAO 2 NAO DESENVOLVIDA");menuCliente();}//LISTAR VOO Q ESTE PASSAGEIRO COMPROU
            case 0 -> {menuCliente();}
            default -> {
                System.err.println("Opção inválida!\nTente novamente\n");
                menuClienteSelecionado(cliente);
            }
        }
    }

    public static List<Voo> bucarData(Date data) {
        List<Voo> voosData = vooManipulacao.getListVoos().stream().filter(x -> (x.getDataPartida().equals(data))).sorted(Comparator.comparing(Voo::getPrecoPassagem)).toList();
        return voosData;
    }

    public static List<Voo> bucarTrajetoVoo(String localPartida,String localChegada) {
        List<Voo> voosTrajeto = vooManipulacao.getListVoos().stream().filter(x -> (x.getLocalChegada().equals(localChegada) && x.getLocalPartida().equals(localPartida))).sorted(Comparator.comparing(Voo::getPrecoPassagem)).toList();
        return voosTrajeto;
    }

    public static void procuraPassagem() throws ParseException {
        EnumSet
                .allOf(SelecionarPassagemEnum.class)
                .forEach(value -> System.out.println(value.getDescricao()));
        switch (valorDigitado()){
            case 1 -> {System.out.println("Digite a data de partida: ");
                Date date = sdf.parse(scan1.nextLine());
                bucarData(date).forEach(value -> System.out.println(value));
                menuCliente();
            }
            case 2 -> {System.out.println("Digite o local de partida: ");
                String lp = scan1.nextLine();
                System.out.println("Digite o local de chegada: ");
                String lc = scan1.nextLine();
                bucarTrajetoVoo(lp,lc).forEach(value -> System.out.println(value));
                menuCliente();}
            case 0 -> {menuCliente();}
            default -> {System.err.println("Opção inválida!\nTente novamente\n");}
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
            case 0 -> menuInicial(true);
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
                menuTodasCompanhias();
            }
            case 5 -> {
                System.out.println("Digite o index da companhia que deseja deletar:");
                int index = Menus.valorDigitado();
                companhiaManipulacao.deleteList(index);
                System.out.println("Companhia deletada com sucesso");
                Menus.menuTodasCompanhias();
            }
            default -> {
                System.err.println("Opção inválida!\nTente novamente\n");
                menuTodasCompanhias();
            }
        }
    }

    public static List<Voo> bucarPorCompanhia(String companhia) {
        List<Voo> listFiltrada = vooManipulacao.getListVoos().stream().filter(x -> x.getCompanhia().equals(companhia)).toList();
        return listFiltrada;
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
                System.out.println(bucarPorCompanhia(companhia.getNome()));
                menuCompanhia(companhia);
            }
            case 3 -> {
                System.out.println("Qual voo você quer editar ?");
                vooManipulacao.listar();
                System.out.println("Digite seu id: ");
                int index = scan1.nextInt();
                scan1.nextLine();

                Voo voo = new Voo();
                voo.setPassageiros(null);
                System.out.println("Digite a data de partida: ");
                Date date = sdf.parse(scan1.next());
                voo.setDataPartida(date);
                System.out.println("Digite a data de chegada: ");
                date = sdf.parse(scan1.next());
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
            case 4 -> {
                System.out.println("Qual voo você deseja excluir ?");
                vooManipulacao.listar();
                System.out.println("Digite o id dele: ");
                int index = scan1.nextInt();
                vooManipulacao.deleteList(index);
                menuCompanhia(companhia);
            }
            case 5 -> {
                vooManipulacao.listar();
                System.out.println("Qual voo você imprimir, busque pelo seu id ?");
                System.out.println(vooManipulacao.readList(scan1.nextInt()));
                menuCompanhia(companhia);
            }
            case 6 -> {
                companhia.imprimir();
                menuCompanhia(companhia);
            }
            default -> {
                System.err.println("Opção inválida!\nTente novamente\n");
                menuCompanhia(companhia);
            }
        }
    }
}
