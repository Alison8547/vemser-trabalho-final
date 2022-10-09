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
    CompanhiaAerea companhiaAerea;
    Voo voo;


    @BeforeEach
    public void setUp() throws ParseException {
        clienteManipulacao = new ClienteManipulacao();
        vooManipulacao = new VooManipulacao();
        companhiaManipulacao = new CompanhiaManipulacao();
    }


    @Test
    public void deveTestarMetodoCreateCliente() {
        cliente = new Cliente("Alison", 22, "444-444-333-44", "alison@hotmail.com", "9999-9999");

        clienteManipulacao.createList(cliente);

        Assertions.assertNotEquals(Collections.EMPTY_LIST, clienteManipulacao);
    }

    @Test
    public void deveTestarMetedoReadCliente(){
        Cliente cliente1 = new Cliente("Pietro",26,"00566783045","pietro.bianchi@dbccompany.br","994668885");
        Cliente cliente2 = new Cliente("Alison",24,"9999999999","alison.silva@dbccompany.br","6666666666");

        clienteManipulacao.createList(cliente1);
        clienteManipulacao.createList(cliente2);

        Assertions.assertEquals(clienteManipulacao.readList(1), cliente2);
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

    @Test
    public void deveTestarMetodoDeleteCliente() {
        Cliente cliente1 = new Cliente("Pietro",26,"00566783045","pietro.bianchi@dbccompany.br","994668885");
        Cliente cliente2 = new Cliente("Alison",24,"9999999999","alison.silva@dbccompany.br","6666666666");
        Cliente cliente3 = new Cliente("Kevin",25,"88888888888","kevin.aryel@dbccompany.br","77777777777");
        clienteManipulacao.createList(cliente1);
        clienteManipulacao.createList(cliente2);
        clienteManipulacao.createList(cliente3);

        clienteManipulacao.deleteList(0);

        Assertions.assertEquals(2, clienteManipulacao.getList().size());
    }

    @Test
    public void deveTestarMetedoCreateVoo() throws ParseException {
        voo = new Voo("Gol",(sdf.parse("10/10/2022")),(sdf.parse("12/10/2022")),"Porto Alegre/RS/BR","Montivideo/UY", 350.50);

        vooManipulacao.createList(voo);

        Assertions.assertNotEquals(Collections.EMPTY_LIST, vooManipulacao);
    }
    @Test
    public void deveTestarMetedoReadVoo() throws ParseException {
        Voo voo1 = new Voo("Gol",(sdf.parse("10/10/2022")),(sdf.parse("12/10/2022")),"Porto Alegre/RS/BR","Montivideo/UY", 350.50);
        Voo voo2 = new Voo("Emirates Airlines",sdf.parse("17/10/2022"),sdf.parse("22/10/2022"),"Porto Alegre/RS/BR","Dubai/EM", 33350.50);

        vooManipulacao.createList(voo1);
        vooManipulacao.createList(voo2);

        Assertions.assertEquals(vooManipulacao.readList(1), voo2);
    }
//    @Test
//    public void deveTestarMetedoUpdateVoo() throws ParseException {
//        Voo voo1 = new Voo("Gol",(sdf.parse("10/10/2022")),(sdf.parse("12/10/2022")),"Porto Alegre/RS/BR","Montivideo/UY", 350.50);
//        vooManipulacao.createList(voo1);
//        Voo voo2 = new Voo();
//        voo2.setDataPartida(sdf.parse("17/10/2022"));
//        voo2.setDataChegada(sdf.parse("22/10/2022"));
//        voo2.setLocalPartida("Porto Alegre/RS/BR");
//        voo2.setLocalChegada("Dubai/EM");
//        voo2.setPrecoPassagem(33350.50);
//        vooManipulacao.updateList(0, voo2);
//
//        Assertions.assertEquals(voo2.getDataPartida(), voo1.getDataPartida());
//        Assertions.assertEquals(voo2.getDataChegada(), voo1.getDataChegada());
//        Assertions.assertEquals(voo2.getLocalPartida(), voo1.getLocalPartida());
//        Assertions.assertEquals(voo2.getLocalChegada(), voo1.getLocalChegada());
//        Assertions.assertEquals(voo2.getPrecoPassagem(), voo1.getPrecoPassagem());
//
//    }
    @Test
    public void deveTestarMetedoDeleteVoo() throws ParseException {
        Voo voo1 = new Voo("Gol",(sdf.parse("10/10/2022")),(sdf.parse("12/10/2022")),"Porto Alegre/RS/BR","Montivideo/UY", 350.50);
        vooManipulacao.createList(voo1);
        vooManipulacao.deleteList(0);

        Assertions.assertEquals(0, vooManipulacao.getList().size());
    }
    @Test
    public void deveTestarMetedoCreateCompanhia(){
        companhiaAerea = new CompanhiaAerea("Gol");
        companhiaManipulacao.createList(companhiaAerea);

        Assertions.assertNotEquals(Collections.EMPTY_LIST, companhiaAerea);
    }
    @Test
    public void deveTestarMetedoReadCompanhia(){
        CompanhiaAerea companhiaAerea2 = new CompanhiaAerea("Tam");
        CompanhiaAerea companhiaAerea3 = new CompanhiaAerea("Azul");

        companhiaManipulacao.createList(companhiaAerea2);
        companhiaManipulacao.createList(companhiaAerea3);

        Assertions.assertEquals(companhiaManipulacao.readList(0), companhiaAerea2);
    }
    @Test
    public void deveTestarMetedoUpdateCompanhia(){
        CompanhiaAerea companhiaAerea1 = new CompanhiaAerea("Gol");
        companhiaManipulacao.createList(companhiaAerea1);
        CompanhiaAerea companhiaAerea4 = new CompanhiaAerea("Emirates Airlines");
        companhiaManipulacao.updateList(0,companhiaAerea4);

        Assertions.assertEquals(companhiaAerea4.getNome(), companhiaAerea1.getNome());
    }
    @Test
    public void deveTestarMetedoDeleteCompanhia(){
        CompanhiaAerea companhiaAerea1 = new CompanhiaAerea("Gol");
        CompanhiaAerea companhiaAerea4 = new CompanhiaAerea("Emirates Airlines");
        companhiaManipulacao.createList(companhiaAerea1);
        companhiaManipulacao.createList(companhiaAerea4);
        companhiaManipulacao.deleteList(0);

        Assertions.assertEquals(1, companhiaManipulacao.getList().size());
    }
}
