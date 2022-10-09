import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class VooManipulacao extends Crud{

    public List<Voo> getListVoos(){
        return super.getList();
    }
    private List<Voo> listVoos;

    public void updateList(Integer id, Voo obj) {
        Optional<Voo> vooBuscado = getListVoos().stream()
                .filter(voo -> voo.getId() == id ).findFirst();
        if (vooBuscado.isPresent()){
           Voo vooAchado = vooBuscado.get();
            vooAchado.setDataPartida(obj.getDataPartida());
            vooAchado.setDataChegada(obj.getDataChegada());
            vooAchado.setLocalPartida(obj.getLocalPartida());
            vooAchado.setLocalChegada(obj.getLocalChegada());
            vooAchado.setPrecoPassagem(obj.getPrecoPassagem());
            System.out.println("Voo editado com sucesso");
        } else {
            System.out.println("Id errado!");
        }
    }
}
