package UNI_11.Principal_I.servico;

import UNI_11.Principal_I.Cartao;
import UNI_11.Principal_I.Estabelecimento;
import UNI_11.Principal_I.Recibo;

public class PagamentoOnlineServico {
    public Recibo efetuarPagamento(Estabelecimento estabelecimento, Cartao cartao, double valor) {
       cartao.debitar(valor);

        // TODO realiza outras lógicas para efetuar o pagamento ao estabelecimento

        return new Recibo(cartao.getTitular(), "Pagamento", valor);
    }
}
