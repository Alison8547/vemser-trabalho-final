import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;

public class ClienteTest {
    ClienteManipulacao clienteManipulacao;
    Cliente cliente;

    @BeforeEach
    public void setUp() {
        clienteManipulacao = new ClienteManipulacao();
    }


    @Test
    public void deveTestarMetodoCreate() {
        cliente = new Cliente("Alison", 22, "444-444-333-44", "alison@hotmail.com", "9999-9999");

        clienteManipulacao.createList(cliente);

        Assertions.assertNotEquals(Collections.EMPTY_LIST, clienteManipulacao);
    }

    @Test
    public void deveTestarMetodoDeletar() {
        cliente = new Cliente("Alison", 22, "444-444-333-44", "alison@hotmail.com", "9999-9999");
        clienteManipulacao.createList(cliente);

        clienteManipulacao.deleteList(0);

        Assertions.assertNull(clienteManipulacao.listar());
    }

    @Test
    public void deveTestarMetodoUpdate() {
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
