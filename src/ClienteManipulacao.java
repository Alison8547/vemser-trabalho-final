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
}
