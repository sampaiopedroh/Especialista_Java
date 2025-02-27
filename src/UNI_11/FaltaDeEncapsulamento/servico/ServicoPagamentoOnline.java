package UNI_11.FaltaDeEncapsulamento.servico;

import UNI_11.FaltaDeEncapsulamento.Cartao;
import UNI_11.FaltaDeEncapsulamento.Estabelecimento;
import UNI_11.FaltaDeEncapsulamento.Recibo;

public class ServicoPagamentoOnline {
    public Recibo efetuarPagamento(Estabelecimento estabelecimento, Cartao cartao, double valor) {
        cartao.debitar(valor);
        // cartao.saldo -= valor;

        return new Recibo(cartao.getTitular(), "Pagamento", valor);
    }
}
