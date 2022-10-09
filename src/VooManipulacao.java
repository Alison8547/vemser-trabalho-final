import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VooManipulacao extends Crud{

    static List<Voo> listVoos = new ArrayList<>();

    public void updateList(Integer index, Voo obj) {
        Voo vooBuscado = listVoos.get(index);
//        vooBuscado.getPassageiros(null);
        vooBuscado.setDataPartida(obj.getDataPartida());
        vooBuscado.setDataChegada(obj.getDataChegada());
        vooBuscado.setLocalPartida(obj.getLocalPartida());
        vooBuscado.setLocalChegada(obj.getLocalChegada());
        vooBuscado.setPrecoPassagem(obj.getPrecoPassagem());
    }

    public static List<Voo> bucarPorLocalChegada(String localChegada) {
        List<Voo> listaLocalCegada = listVoos.stream()
                .filter(x -> x.getLocalChegada().equals(localChegada))
                .collect(Collectors.toList());
        return listaLocalCegada;
    }

    public static List<Voo> bucarPorLocalPartidaLocalChegada(String localPartida,String localChegada) {
        List<Voo> listaPossivel = listVoos.stream()
                .filter(x -> (x.getLocalChegada().equals(localChegada) && x.getLocalPartida().equals(localPartida)))
                .collect(Collectors.toList());
        return listaPossivel;
    }

    public List<Voo> getListVoos(){ return super.getList();}

}
