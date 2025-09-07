package UNI_11.Principal_I.servico;

import UNI_11.Principal_I.Cartao;
import UNI_11.Principal_I.Recibo;

public class DepositoPixServico {
    public Recibo efeturaDeposito(Cartao cartao, double valorDeposito) {
        // TODO faz cobrança do valor no PIX

        cartao.depositar(valorDeposito);

        return new Recibo(cartao.getTitular(), "Depósito", valorDeposito);
    }
}
