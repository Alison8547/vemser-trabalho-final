import java.util.EnumSet;
import java.util.Scanner;

public class Menus {

    static int valorDigitado(){
        Scanner scan = new Scanner(System.in);
        int valor = scan.nextInt();
        scan.nextLine();
        return valor;
    }

    public static void menuInicial(){
        System.out.println("Olá, bem vindo ao sistema de passagens aéreas Varig");
        System.out.println("Digite 1 para entrar ná pagina de clientes," +
                " 2 para entrar na página de Companhias ou 0 para sair");
        switch (valorDigitado()){
            case 0 -> System.out.println("Adeus");
            case 1 -> menuCliente();
            case 2 -> menuTodasCompanhias();
        }
    }
    private static void menuCliente(){
        System.out.println("\nBem vindo a area de Clientes");
        option();
        EnumSet
                .allOf(MenuClienteGeralEnum.class)
                .forEach(value -> System.out.println(value.getDescricao()));
        switch (valorDigitado()){
            case 0 -> menuInicial();
        }
    }

    private static void   option(){
        System.out.println("Escolha uma opção para continuar:");
    }

    public static void menuTodasCompanhias(){
        System.out.println("\nBem vindo a area de Companhias");
        option();
        EnumSet
                .allOf(MenuCompanhiaGeralEnum.class)
                .forEach(value -> System.out.println(value.getDescricao()));
        switch (valorDigitado()){
            case 0 -> menuInicial();
            case 1 -> {
                CompanhiaManipulacao.mostrarCompanhias();
                menuTodasCompanhias();
            }
            case 2 -> CompanhiaManipulacao.criarCompanhia();
            case 3 -> CompanhiaManipulacao.selecionarCompanhia();
            case 4 -> CompanhiaManipulacao.editarCompanhia();
            case 5 -> CompanhiaManipulacao.deletarCompanhia();
        }
    }

    static void menuCompanhia(CompanhiaAerea companhia){
        System.out.println("\n Bem vindo ao menu da companhia "+companhia.getNome());
        option();
        EnumSet
                .allOf(MenuCompanhiaEnum.class)
                .forEach(value -> System.out.println(value.getDescricao()));
        switch (valorDigitado()){
            case 0 -> menuTodasCompanhias();
            case 6 -> {
                companhia.imprimir();
                menuCompanhia(companhia);
            }
        }
    }
}
