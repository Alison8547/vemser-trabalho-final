import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class CompanhiaManipulacao extends Crud {

    private List<CompanhiaAerea> companhiaAereaList;

    public List<CompanhiaAerea> getListCompanhia(){
        return super.getList();
    }

    public void updateList(Integer index, CompanhiaAerea companhia) {
        CompanhiaAerea companhiaBuscada = getListCompanhia().get(index);
        companhiaBuscada.setNome(companhia.getNome());
    }
}