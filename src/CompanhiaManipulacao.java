import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class CompanhiaManipulacao extends Crud {

    private List<CompanhiaAerea> companhiaAereaList;

    public CompanhiaManipulacao() {
        this.companhiaAereaList = new ArrayList<>();
    }

    public void updateList(Integer index, CompanhiaAerea companhia) {
        CompanhiaAerea companhiaBuscada = companhiaAereaList.get(index);
        companhiaBuscada.setNome(companhia.getNome());
    }

}