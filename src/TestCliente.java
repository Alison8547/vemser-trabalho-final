import java.util.Scanner;

public class TestCliente {
    public static void testCliente() {
        Scanner scanner = new Scanner(System.in);

        ClienteManipulacao clienteManipulacao = new ClienteManipulacao();
        Cliente cliente1 = new Cliente("Pietro",26,"00566783045","pietro.bianchi@dbccompany.br","994668885");
        clienteManipulacao.createList(cliente1);
        Cliente cliente2 = new Cliente("Alison",24,"9999999999","alison.silva@dbccompany.br","6666666666");
        clienteManipulacao.createList(cliente2);
        Cliente cliente3 = new Cliente("Kevin",25,"88888888888","kevin.aryel@dbccompany.br","77777777777");
        clienteManipulacao.createList(cliente3);
        Cliente cliente4 = new Cliente("Maicon",31,"11111111111","maicon.gerardi@dbccompany.br","5555555555");
        clienteManipulacao.createList(cliente4);
        Cliente cliente5 = new Cliente("Ricardo",27,"2222222222","ricador.langbecker@dbccompany.br","4444444444");
        clienteManipulacao.createList(cliente5);
        Cliente cliente6 = new Cliente("Gaby",24,"3333333333","gaby.freitas@dbccompany.br","33333333333");
        clienteManipulacao.createList(cliente6);
        Cliente cliente7 = new Cliente("Felipe",26,"4444444444","felipe.noguez@dbccompany.br","888888888");
        clienteManipulacao.createList(cliente7);
        Cliente cliente8 = new Cliente("Lucas",26,"0000000000","lucas.pereira@dbccompany.br","000000000");
        clienteManipulacao.createList(cliente8);

        int escolha = 0;

        while (escolha != 9) {
            System.out.println("Digite [1] para adicionar um cliente\nDigite [2] para listar todos os clientes\nDigite [3] para buscar um cliente específico\nDigite [4] para editar\nDigite [5] para excluir\nDigite [9] para sair!");
            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1 -> {
                    Cliente cliente = new Cliente();
                    System.out.println("Digite seu nome: ");
                    cliente.setNome(scanner.nextLine());
                    System.out.println("Digite sua idade: ");
                    cliente.setIdade(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Digite seu cpf: ");
                    cliente.setCpf(scanner.nextLine());
                    System.out.println("Digite seu email: ");
                    cliente.setEmail(scanner.nextLine());
                    System.out.println("Digite seu telefone: ");
                    cliente.setTelefone(scanner.nextLine());
                    clienteManipulacao.createList(cliente);
                }

                case 2 -> {
                    clienteManipulacao.listar();
                }

                case 3 -> {
                    clienteManipulacao.listar();
                    System.out.println("Qual cliente você quer buscar pelo seu id ?");
                    System.out.println(clienteManipulacao.readList(scanner.nextInt()));
                }

                case 4 -> {
                    System.out.println("Qual cliente você quer editar ?");
                    clienteManipulacao.listar();
                    System.out.println("Digite seu id: ");
                    int index = scanner.nextInt();
                    scanner.nextLine();

                    Cliente cliente = new Cliente();
                    System.out.println("Digite seu nome: ");
                    cliente.setNome(scanner.nextLine());
                    System.out.println("Digite sua idade: ");
                    cliente.setIdade(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Digite seu email: ");
                    cliente.setEmail(scanner.nextLine());
                    System.out.println("Digite seu telefone: ");
                    cliente.setTelefone(scanner.nextLine());
                    clienteManipulacao.updateList(index, cliente);

                }
                case 5 -> {
                    System.out.println("Qual cliente você deseja excluir ?");
                    clienteManipulacao.listar();
                    System.out.println("Digite o id dele: ");
                    int index = scanner.nextInt();

                    clienteManipulacao.deleteList(index);
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
