import java.text.SimpleDateFormat;
import java.util.List;
import java.text.ParseException;

public class AreaTeste {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public AreaTeste() throws ParseException {
        //Cliente
        Cliente cliente1 = new Cliente("Pietro",26,"00566783045","pietro.bianchi@dbccompany.br","994668885");

        Cliente cliente2 = new Cliente("Alison",24,"9999999999","alison.silva@dbccompany.br","6666666666");

        Cliente cliente3 = new Cliente("Kevin",25,"88888888888","kevin.aryel@dbccompany.br","77777777777");

        Cliente cliente4 = new Cliente("Maicon",31,"11111111111","maicon.gerardi@dbccompany.br","5555555555");

        Cliente cliente5 = new Cliente("Ricardo",27,"2222222222","ricador.langbecker@dbccompany.br","4444444444");

        Cliente cliente6 = new Cliente("Gaby",24,"3333333333","gaby.freitas@dbccompany.br","33333333333");

        Cliente cliente7 = new Cliente("Felipe",26,"4444444444","felipe.noguez@dbccompany.br","888888888");

        Cliente cliente8 = new Cliente("Lucas",26,"0000000000","lucas.pereira@dbccompany.br","000000000");

        //Voo
        Voo voo1 = new Voo(null,sdf.parse("10/10/2022"),sdf.parse("12/10/2022"),"Porto Alegre/RS/BR","Montivideo/UY", 350.50);

        Voo voo2 = new Voo(List.of(cliente8, cliente5, cliente6, cliente2),sdf.parse("17/10/2022"),sdf.parse("22/10/2022"),"Porto Alegre/RS/BR","Dubai/EM", 33350.50);

        Voo voo3 = new Voo(null,sdf.parse("15/10/2022"),sdf.parse("15/10/2022"),"Porto Alegre/RS/BR","Rio de Janeiro/RJ/BR", 250.90);

        Voo voo4 = new Voo(null,sdf.parse("23/12/2022"),sdf.parse("27/12/2022"),"Porto Alegre/RS/BR","Natal/RN/BR", 490.68);

        Voo voo5 = new Voo(null,sdf.parse("11/11/2022"),sdf.parse("12/11/2022"),"Porto Alegre/RS/BR","São Paulo/SP/BR", 325.37);

        Voo voo6 = new Voo(null,sdf.parse("13/12/2022"),sdf.parse("17/12/2022"),"Dubai/EM","Porto Alegre/RS/BR", 27350.50);

    }
}
