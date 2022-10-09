import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPagamento {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        Cliente cliente = new Cliente("Alison", 23, "785-543-434-44", "Alison@hotmail.com", "8473-4344");
        Cliente[] clientes = {cliente};
        Voo voo = new Voo(null,"Azul",sdf.parse("10/10/2022"),sdf.parse("12/10/2022"),"Porto Alegre/RS/BR","Montivideo/UY", 350.50);
        CompanhiaAerea companhiaAerea = new CompanhiaAerea("Gol");
        Pagamento pagamento = new Pagamento(cliente,voo);

        pagamento.imprimirComprovante();
    }
}
