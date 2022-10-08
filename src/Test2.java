import entity.Cliente;
import entity.Pagamento;
import entity.Voo;

import java.util.Date;

public class Test2 {
    public static void main(String[] args) {
        Date date = new Date();
        Cliente cliente = new Cliente("Alison", 23, "785-543-434-44", "Alison@hotmail.com", "8473-4344");
        Cliente[] clientes = {cliente};
        Voo voo = new Voo(1, clientes, date, date, "Recife/PE/BR", "Campinas/SP/BR", 2000);
        Pagamento pagamento = new Pagamento(cliente,voo);

        pagamento.imprimirComprovante();
    }
}
