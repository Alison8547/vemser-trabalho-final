import java.util.ArrayList;
import java.util.List;

public class ClienteManipulacao extends Crud{
    private List<Cliente> clienteList;

    public ClienteManipulacao() {
        this.clienteList = new ArrayList<>();
    }

    @Override
    public List<Cliente> getList() {
        return super.getList();
    }

    public void updateList(Integer index, Cliente obj) {
        Cliente clienteBuscado = getList().get(index);
        clienteBuscado.setNome(obj.getNome());
        clienteBuscado.setIdade(obj.getIdade());
        clienteBuscado.setCpf(obj.getCpf());
        clienteBuscado.setEmail(obj.getEmail());
        clienteBuscado.setTelefone(obj.getTelefone());
    }
}
