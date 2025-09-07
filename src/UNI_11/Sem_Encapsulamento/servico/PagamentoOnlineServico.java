package UNI_11.Sem_Encapsulamento.servico;

import UNI_11.Sem_Encapsulamento.Cartao;
import UNI_11.Sem_Encapsulamento.Estabelecimento;
import UNI_11.Sem_Encapsulamento.Recibo;

public class PagamentoOnlineServico {
    public Recibo efetuarPagamento(Estabelecimento estabelecimento, Cartao cartao, double valor) {
        if (cartao.saldo < valor) {
            throw new RuntimeException("Saldo insuficiente para pagamento");
        }

        cartao.saldo -= valor;

        // TODO realiza outras lógicas para efetuar o pagamento ao estabelecimento

        return new Recibo(cartao.titular, "Pagamento", valor);
    }
}
