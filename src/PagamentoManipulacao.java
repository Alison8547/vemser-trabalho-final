import java.util.ArrayList;
import java.util.List;

public class PagamentoManipulacao extends Crud {

    private List<Pagamento> pagamentoList = new ArrayList<>();

    public void updateList(Integer index, Pagamento pagamento) {
        Pagamento pagamentoBuscado = pagamentoList.get(index);
        pagamentoBuscado.setConfirmacaoPagamento(pagamento.isConfirmacaoPagamento());
    }
}
