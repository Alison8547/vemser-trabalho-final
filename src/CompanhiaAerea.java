import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class CompanhiaAerea {
     private int idCompanhia;
     private String nome;
     public int getId(){
          return idCompanhia;
     }
     public CompanhiaAerea( String nome){
          this.nome = nome;
     }

     private static final SecureRandom secureRandom = new SecureRandom();


     {
          idCompanhia = 1 + secureRandom.nextInt(400);
     }

     public String toString(){
          return "Id: "+idCompanhia+" Nome: "+nome;
     }

     public void setNome(String nome){
          this.nome = nome;
     }
     public String getNome(){
          return nome;
     }

     public void imprimir(){
          System.out.println("Dados da companhia "+nome);
          System.out.println("ID = "+idCompanhia);
     }
}
