import entity.Cliente;
import entity.ClienteManipulacao;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ClienteManipulacao clienteManipulacao = new ClienteManipulacao();

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
                    clienteManipulacao.adicionarCliente(cliente);
                }

                case 2 -> {
                    clienteManipulacao.listarClientes();
                }

                case 3 -> {
                    clienteManipulacao.listarClientes();
                    System.out.println("Qual cliente você quer buscar pelo seu id ?");
                    clienteManipulacao.buscarCliente(scanner.nextInt());
                }

                case 4 -> {
                    System.out.println("Qual cliente você quer editar ?");
                    clienteManipulacao.listarClientes();
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
                    clienteManipulacao.editarCliente(index, cliente);

                }
                case 5 -> {
                    System.out.println("Qual cliente você deseja excluir ?");
                    clienteManipulacao.listarClientes();
                    System.out.println("Digite o id dele: ");
                    int index = scanner.nextInt();

                    clienteManipulacao.removerCliente(index);
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
