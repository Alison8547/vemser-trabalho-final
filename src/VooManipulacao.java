import java.util.ArrayList;
import java.util.List;

public class VooManipulacao extends Crud{

    public List<Voo> getListVoos(){
        return super.getList();
    }
    private List<Voo> listVoos;

    public void updateList(Integer index, Voo obj) {
        Voo vooBuscado = listVoos.get(index);
//        vooBuscado.getPassageiros(null);
        vooBuscado.setDataPartida(obj.getDataPartida());
        vooBuscado.setDataChegada(obj.getDataChegada());
        vooBuscado.setLocalPartida(obj.getLocalPartida());
        vooBuscado.setLocalChegada(obj.getLocalChegada());
        vooBuscado.setPrecoPassagem(obj.getPrecoPassagem());
    }
}
