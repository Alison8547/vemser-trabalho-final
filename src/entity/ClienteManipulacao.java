package entity;

import java.util.ArrayList;
import java.util.List;

public class ClienteManipulacao {
    private List<Cliente> clienteList;

    public ClienteManipulacao() {
        this.clienteList = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        clienteList.add(cliente);
    }

    public void buscarCliente(Integer index) {
        Cliente clienteBuscado = clienteList.get(index);
        System.out.println(clienteBuscado);
    }

    public void removerCliente(Integer index) {
        this.clienteList.remove(index.intValue());
    }

    public void editarCliente(Integer index, Cliente cliente) {
        Cliente clienteBuscado = clienteList.get(index);
        clienteBuscado.setNome(cliente.getNome());
        clienteBuscado.setIdade(cliente.getIdade());
        clienteBuscado.setEmail(cliente.getEmail());
        clienteBuscado.setTelefone(cliente.getTelefone());
    }

    public void listarClientes() {
        for (int i = 0; i < clienteList.size(); i++) {
            System.out.println("id=" + i + " | " + clienteList.get(i));
        }
    }
}
