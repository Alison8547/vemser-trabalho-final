import entity.Cliente;
import entity.CompanhiaAerea;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
public class Main {

    static List<CompanhiaAerea> companhias =  new ArrayList<>();
    static List<Cliente> usuarios = new ArrayList<>();

    public static void criarCompanhia(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome da companhia");
        String nome = scan.nextLine();
        int id;
        if (companhias.size() == 0){
            id = 1;
        } else {
            id = companhias.get(companhias.size()-1).getId();
            id++;
        }
        companhias.add(new CompanhiaAerea(id,nome));
        System.out.println("Companhia criada com sucesso");
        Menus.menuTodasCompanhias();
    }
    public static void mostrarCompanhias(){
        if (checarExisteCompanhia()){
            if (companhias != null){
                companhias.forEach(System.out::println);
            } else {
                System.out.println("Nenhuma companhia registrada!");
            }
        }
    }

    public static Optional<CompanhiaAerea> selecionarCompanhiaPorId(int id){
        return companhias.stream()
                .filter(companhiaAerea -> companhiaAerea.getId() == id)
                .findFirst();
    }

    public static void deletarCompanhia(){
        System.out.println("Digite o Id da companhia que deseja deletar:");
        mostrarCompanhias();
        int id = Menus.valorDigitado();
        Optional<CompanhiaAerea> companhiaDeletar = selecionarCompanhiaPorId(id);
        if(companhiaDeletar.isPresent()){
            companhias.remove(companhiaDeletar.get());
            System.out.println("Companhia deletada com sucesso");
        } else {
            System.out.println("Não foi possivel deletar");
        }
        Menus.menuTodasCompanhias();
    }

    public static void editarCompanhia(){
        System.out.println("Digite o id da companhia que deseja editar:");
        mostrarCompanhias();
        int id = Menus.valorDigitado();
        Optional<CompanhiaAerea> companhiaEditar = selecionarCompanhiaPorId(id);
        if (companhiaEditar.isPresent()){
            Scanner scan = new Scanner(System.in);
            System.out.println("Dados atuais da companhia:"+companhiaEditar.get() );
            System.out.println("Digite o novo nome:");
            String novoNome = scan.nextLine();
            companhiaEditar.get().setNome(novoNome);
        } else {
            System.out.println("Id inválido, não é possivel editar.");
        }
        Menus.menuTodasCompanhias();

    }

    public static boolean checarExisteCompanhia(){
        if (companhias.size() == 0){
            System.out.println("Nenhuma companhia encontrada");
            Menus.menuTodasCompanhias();
            return false;
        }
        return true;
    }

    public static void selecionarCompanhia(){
        System.out.println("Digite o ID da companhia que deseja selecionar:");
        mostrarCompanhias();
        int id = Menus.valorDigitado();
        Optional<CompanhiaAerea> companhiaSelecionada = selecionarCompanhiaPorId(id);
        if (companhiaSelecionada.isPresent()){
            Menus.menuCompanhia(companhiaSelecionada.get());
        } else {
            System.out.println("Não foi possível selecionar a companhia");
            Menus.menuTodasCompanhias();
        }
    }

    public static void main(String[] args) {
        Menus.menuInicial();
    }
}