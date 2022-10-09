import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pagamento implements Imprimir{
    private int idPagamento;
    private boolean confirmacaoPagamento;
    private final LocalDateTime dataHoraPagamento = LocalDateTime.now();
    private Cliente cliente;
    private Voo voo;
    private CompanhiaAerea companhiaAerea;
    private static final SecureRandom secureRandom = new SecureRandom();

    {
        idPagamento = 1 + secureRandom.nextInt(500);
    }

    public Pagamento(Cliente cliente, Voo voo, CompanhiaAerea companhiaAerea) {
        this.cliente = cliente;
        this.voo = voo;
        this.companhiaAerea = companhiaAerea;
    }

    public boolean pagar(Voo voo) {
        return true;
    }


    public String getDataHoraPagamento() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return dataHoraPagamento.format(formatter);
    }

    public int getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(int idPagamento) {
        this.idPagamento = idPagamento;
    }

    public boolean isConfirmacaoPagamento() {
        return confirmacaoPagamento;
    }

    public void setConfirmacaoPagamento(boolean confirmacaoPagamento) {
        this.confirmacaoPagamento = confirmacaoPagamento;
    }

    @Override
    public void imprimirDados() {
        System.out.printf("Id do pagamento: %d%n", idPagamento);
        System.out.printf("Data e Hora do pagamento: %s%n", getDataHoraPagamento());
        System.out.printf("Nome: %s%nCpf: %s%n", cliente.getNome(), cliente.getCpf());
        System.out.printf("Preço do Voo: R$ %.2f%n", voo.getPrecoPassagem());
        System.out.printf("Nome da Companhia: %s%n", companhiaAerea.getNome());
        System.out.printf("Id do Voo: %d%nLocal Partida: %s%nLocal Chegada: %s%n", voo.getId(), voo.getLocalPartida(), voo.getLocalChegada());
    }
}
