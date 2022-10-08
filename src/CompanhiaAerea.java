import java.util.ArrayList;
import java.util.List;

public class CompanhiaAerea {
     private List<Voo> voos = new ArrayList<>();
     private int id;
     private String nome;
     public int getId(){
          return id;
     }
     public CompanhiaAerea(int id, String nome){
          this.id = id;
          this.nome = nome;
     }

     public String toString(){
          return "Id: "+id+" Nome: "+nome;
     }

     public void setNome(String nome){
          this.nome = nome;
     }
     public String getNome(){
          return nome;
     }

     public List<Voo> getVoos(){
          return voos;
     }

     public void imprimir(){
          System.out.println("Dados da companhia "+nome);
          System.out.println("ID = "+id);
          System.out.println("Voos:");
          if (voos.size() == 0 ){
               System.out.println("Nenhum voo encontrado");
          } else {
               voos.forEach(voo -> System.out.println(voo));
          }
     }
}
