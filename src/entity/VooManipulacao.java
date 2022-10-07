package entity;

import java.util.ArrayList;
import java.util.List;

public class VooManipulacao {

    static List<Voo> listVoos = new ArrayList<>();

    public void createVoo(Voo voo){
        listVoos.add(voo);
    }

    public void readVoo(Integer index){
        Voo vooBuscado = listVoos.get(index);
    }

    public void updateVoo(Integer index, Voo voo){
        Voo vooBuscado = listVoos.get(index);
//        vooBuscado.getPassageiros(null);
        vooBuscado.setDataPartida(voo.getDataPartida());
        vooBuscado.setDataChegada(voo.getDataChegada());
        vooBuscado.setLocalPartida(voo.getLocalPartida());
        vooBuscado.setLocalChegada(voo.getLocalChegada());
        vooBuscado.setPrecoPassagem(voo.getPrecoPassagem());
    }

    public void deleteVoo(Integer index){
        listVoos.remove(index.intValue());
    }

}
