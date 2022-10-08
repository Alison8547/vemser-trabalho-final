package entity;

import java.util.ArrayList;
import java.util.List;

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
}
