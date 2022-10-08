package entity;

import java.util.ArrayList;
import java.util.List;

public class ClienteManipulacao extends Crud{
    private List<Cliente> clienteList;

    public ClienteManipulacao() {
        this.clienteList = new ArrayList<>();
    }

    public void updateList(Integer index, Cliente obj) {
        Cliente clienteBuscado = clienteList.get(index);
        clienteBuscado.setNome(obj.getNome());
        clienteBuscado.setIdade(obj.getIdade());
        clienteBuscado.setEmail(obj.getEmail());
        clienteBuscado.setTelefone(obj.getTelefone());
    }

//    public void listarClientes() {
//        for (int i = 0; i < clienteList.size(); i++) {
//            System.out.println("id=" + i + " | " + clienteList.get(i));
//        }
//    }
}
