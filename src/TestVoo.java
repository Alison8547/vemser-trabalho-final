import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestVoo {
    public static void testVoo() throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        VooManipulacao vooManipulacao = new VooManipulacao();
        Voo voo1 = new Voo(null,sdf.parse("10/10/2022"),sdf.parse("12/10/2022"),"Porto Alegre/RS/BR","Montivideo/UY", 350.50);
        vooManipulacao.createList(voo1);
        Voo voo2 = new Voo(null,sdf.parse("17/10/2022"),sdf.parse("22/10/2022"),"Porto Alegre/RS/BR","Dubai/EM", 33350.50);
        vooManipulacao.createList(voo2);
        Voo voo3 = new Voo(null,sdf.parse("15/10/2022"),sdf.parse("15/10/2022"),"Porto Alegre/RS/BR","Rio de Janeiro/RJ/BR", 250.90);
        vooManipulacao.createList(voo3);
        Voo voo4 = new Voo(null,sdf.parse("23/12/2022"),sdf.parse("27/12/2022"),"Porto Alegre/RS/BR","Natal/RN/BR", 490.68);
        vooManipulacao.createList(voo4);
        Voo voo5 = new Voo(null,sdf.parse("11/11/2022"),sdf.parse("12/11/2022"),"Porto Alegre/RS/BR","São Paulo/SP/BR", 325.37);
        vooManipulacao.createList(voo5);
        Voo voo6 = new Voo(null,sdf.parse("13/12/2022"),sdf.parse("17/12/2022"),"Dubai/EM","Porto Alegre/RS/BR", 27350.50);
        vooManipulacao.createList(voo6);

        int n = 0;

        while (n != 9){
            System.out.println("Digite [1] para adicionar um voo" +
                    "\nDigite [2] para listar todos os voo" +
                    "\nDigite [3] para buscar um voo específico" +
                    "\nDigite [4] para editar um voo" +
                    "\nDigite [5] para excluir um voo" +
                    "\nDigite [9] para sair!");
            n = sc.nextInt();
            sc.nextLine();

            switch (n) {
                case 1 -> {
                    Voo voo = new Voo();
                    voo.setPassageiros(null);
                    System.out.println("Digite a data de partida: ");
                    Date date = sdf.parse(sc.next());
                    voo.setDataPartida(date);
                    System.out.println("Digite a data de chegada: ");
                    date = sdf.parse(sc.next());
                    voo.setDataChegada(date);
                    System.out.println("Digite o Local de partida: ");
                    voo.setLocalPartida(sc.nextLine());
                    System.out.println("Digite o Local de chegada: ");
                    voo.setLocalChegada(sc.nextLine());
                    System.out.println("Digite o preço da passagem: ");
                    voo.setPrecoPassagem(sc.nextDouble());
                    vooManipulacao.createList(voo);
                }

                case 2 -> {
                    vooManipulacao.listar();
                }

                case 3 -> {
                    vooManipulacao.listar();
                    System.out.println("Qual voo você quer buscar pelo seu id ?");
                    System.out.println(vooManipulacao.readList(sc.nextInt()));
                }

                case 4 -> {
                    System.out.println("Qual voo você quer editar ?");
                    vooManipulacao.listar();
                    System.out.println("Digite seu id: ");
                    int index = sc.nextInt();
                    sc.nextLine();

                    Voo voo = new Voo();
                    voo.setPassageiros(null);
                    System.out.println("Digite a data de partida: ");
                    Date date = sdf.parse(sc.next());
                    voo.setDataPartida(date);
                    System.out.println("Digite a data de chegada: ");
                    date = sdf.parse(sc.next());
                    voo.setDataChegada(date);
                    System.out.println("Digite o Local de partida: ");
                    voo.setLocalPartida(sc.nextLine());
                    System.out.println("Digite o Local de chegada: ");
                    voo.setLocalChegada(sc.nextLine());
                    System.out.println("Digite o preço da passagem: ");
                    voo.setPrecoPassagem(sc.nextDouble());
                    vooManipulacao.createList(voo);

                }
                case 5 -> {
                    System.out.println("Qual voo você deseja excluir ?");
                    vooManipulacao.listar();
                    System.out.println("Digite o id dele: ");
                    int index = sc.nextInt();

                    vooManipulacao.deleteList(index);
                }
                case 9 -> {
                    System.out.println("Você saiu do cadastro!");
                }
                default -> {
                    System.err.println("Opção inválida!");
                }
            }
        }
    }
}
