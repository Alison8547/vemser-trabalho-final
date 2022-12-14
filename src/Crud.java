import java.util.ArrayList;
import java.util.List;

public abstract class Crud<T> {
    private List<T> value = new ArrayList<>();

    public void createList(T obj){
        value.add(obj);
    }

    public List<T> getList(){
        return value;
    }

     public T readList(Integer index){
        T aux = value.get(index);
        return aux;
    }
    public void deleteList(Integer index){
        value.remove(index.intValue());
    }

    public List<T> listar() {
        for (int i = 0; i < value.size(); i++) {
            System.out.println("index=" + i + " | " + value.get(i));
        }
        return null;
    }
}
