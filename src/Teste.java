import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;

public class Teste {
    ClienteManipulacao clienteManipulacao;
    VooManipulacao vooManipulacao;
    CompanhiaManipulacao companhiaManipulacao;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Cliente cliente;
    Cliente cliente1 = new Cliente("Pietro",26,"00566783045","pietro.bianchi@dbccompany.br","994668885");
    Cliente cliente2 = new Cliente("Alison",24,"9999999999","alison.silva@dbccompany.br","6666666666");
    Cliente cliente3 = new Cliente("Kevin",25,"88888888888","kevin.aryel@dbccompany.br","77777777777");
    Cliente cliente4 = new Cliente("Maicon",31,"11111111111","maicon.gerardi@dbccompany.br","5555555555");
    Cliente cliente5 = new Cliente("Ricardo",27,"2222222222","ricador.langbecker@dbccompany.br","4444444444");
    Cliente cliente6 = new Cliente("Gaby",24,"3333333333","gaby.freitas@dbccompany.br","33333333333");
    Cliente cliente7 = new Cliente("Felipe",26,"4444444444","felipe.noguez@dbccompany.br","888888888");
    Cliente cliente8 = new Cliente("Lucas",26,"0000000000","lucas.pereira@dbccompany.br","000000000");
    //        clienteManipulacao.createList(cliente1);
//        clienteManipulacao.createList(cliente2);
//        clienteManipulacao.createList(cliente3);
//        clienteManipulacao.createList(cliente4);
//        clienteManipulacao.createList(cliente5);
//        clienteManipulacao.createList(cliente6);
//        clienteManipulacao.createList(cliente7);
//        clienteManipulacao.createList(cliente8);
    CompanhiaAerea companhiaAerea1 = new CompanhiaAerea("Gol");
    CompanhiaAerea companhiaAerea2 = new CompanhiaAerea("Tam");
    CompanhiaAerea companhiaAerea3 = new CompanhiaAerea("Azul");
    CompanhiaAerea companhiaAerea4 = new CompanhiaAerea("Emirates Airlines");
    //        companhiaManipulacao.createList(companhiaAerea1);
//        companhiaManipulacao.createList(companhiaAerea2);
//        companhiaManipulacao.createList(companhiaAerea3);
//        companhiaManipulacao.createList(companhiaAerea4);
    Voo voo1 = new Voo("Gol",(sdf.parse("10/10/2022")),(sdf.parse("12/10/2022")),"Porto Alegre/RS/BR","Montivideo/UY", 350.50);
    Voo voo2 = new Voo("Emirates Airlines",sdf.parse("17/10/2022"),sdf.parse("22/10/2022"),"Porto Alegre/RS/BR","Dubai/EM", 33350.50);
    Voo voo3 = new Voo("Tam",sdf.parse("15/10/2022"),sdf.parse("15/10/2022"),"Porto Alegre/RS/BR","Rio de Janeiro/RJ/BR", 250.90);
    Voo voo4 = new Voo("Azul",(sdf.parse("23/12/2022")),sdf.parse("27/12/2022"),"Porto Alegre/RS/BR","Natal/RN/BR", 490.68);
    Voo voo5 = new Voo("Azul",sdf.parse("11/11/2022"),sdf.parse("12/11/2022"),"Porto Alegre/RS/BR","São Paulo/SP/BR", 325.37);
    Voo voo6 = new Voo("Emirates Airlines",sdf.parse("13/12/2022"),sdf.parse("17/12/2022"),"Dubai/EM","Porto Alegre/RS/BR", 27350.50);
    Voo voo7 = new Voo("Tam",sdf.parse("11/11/2022"),sdf.parse("12/11/2022"),"Porto Alegre/RS/BR","São Paulo/SP/BR", 400.37);
    Voo voo8 = new Voo("Gol",sdf.parse("11/11/2022"),sdf.parse("12/11/2022"),"Porto Alegre/RS/BR","São Paulo/SP/BR", 368.37);

    public Teste() throws ParseException {
    }
//        vooManipulacao.createList(voo1);
//        vooManipulacao.createList(voo2);
//        vooManipulacao.createList(voo3);
//        vooManipulacao.createList(voo4);
//        vooManipulacao.createList(voo5);
//        vooManipulacao.createList(voo6);
//        vooManipulacao.createList(voo7);
//        vooManipulacao.createList(voo8);

    @BeforeEach
    public void setUp() throws ParseException {
        clienteManipulacao = new ClienteManipulacao();
        vooManipulacao = new VooManipulacao();
        companhiaManipulacao = new CompanhiaManipulacao();
        voo1.addPassageiros(cliente1);
        voo1.addPassageiros(cliente3);
        voo2.addPassageiros(cliente8);
        voo2.addPassageiros(cliente5);
        voo2.addPassageiros(cliente6);
        voo2.addPassageiros(cliente2);
        voo3.addPassageiros(cliente1);
        voo3.addPassageiros(cliente5);
        voo3.addPassageiros(cliente4);
        voo3.addPassageiros(cliente7);
        voo5.addPassageiros(cliente8);
        voo5.addPassageiros(cliente5);
        voo5.addPassageiros(cliente6);
        voo5.addPassageiros(cliente2);
        voo6.addPassageiros(cliente8);
        voo6.addPassageiros(cliente5);
        voo6.addPassageiros(cliente6);
        voo6.addPassageiros(cliente2);
    }


    @Test
    public void deveTestarMetodoCreateCliente() {
        cliente = new Cliente("Alison", 22, "444-444-333-44", "alison@hotmail.com", "9999-9999");

        clienteManipulacao.createList(cliente);

        Assertions.assertNotEquals(Collections.EMPTY_LIST, clienteManipulacao);
    }

    @Test
    public void deveTestarMetodoDeletarCliente() {
        cliente = new Cliente("Alison", 22, "444-444-333-44", "alison@hotmail.com", "9999-9999");
        clienteManipulacao.createList(cliente);

        clienteManipulacao.deleteList(0);

        Assertions.assertNull(clienteManipulacao.listar());
    }

    @Test
    public void deveTestarMetodoUpdateCliente() {
        cliente = new Cliente("José", 22, "411-444-333-44", "alison@hotmail.com", "9999-9999");
        clienteManipulacao.createList(cliente);
        Cliente cliente2 = new Cliente();
        cliente2.setNome("Diego");
        cliente2.setIdade(30);
        cliente2.setEmail("diago@hotmail.com");
        cliente2.setTelefone("2442-2222");

        clienteManipulacao.updateList(0, cliente2);

        Assertions.assertEquals(cliente2.getNome(), cliente.getNome());
        Assertions.assertEquals(cliente2.getIdade(), cliente.getIdade());
        Assertions.assertEquals(cliente2.getEmail(), cliente.getEmail());
        Assertions.assertEquals(cliente2.getTelefone(), cliente.getTelefone());
    }


}
