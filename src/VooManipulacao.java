import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VooManipulacao extends Crud{

    public List<Voo> getListVoos(){
        return super.getList();
    }
    private List<Voo> listVoos;

    public void updateList(Integer index, Voo obj) {
        Voo vooBuscado = getListVoos().get(index);
//        vooBuscado.getPassageiros(null);
        vooBuscado.setDataPartida(obj.getDataPartida());
        vooBuscado.setDataChegada(obj.getDataChegada());
        vooBuscado.setLocalPartida(obj.getLocalPartida());
        vooBuscado.setLocalChegada(obj.getLocalChegada());
        vooBuscado.setPrecoPassagem(obj.getPrecoPassagem());
    }
}
