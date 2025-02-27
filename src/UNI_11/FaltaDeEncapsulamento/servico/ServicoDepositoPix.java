package UNI_11.FaltaDeEncapsulamento.servico;

import UNI_11.FaltaDeEncapsulamento.Cartao;
import UNI_11.FaltaDeEncapsulamento.Recibo;

public class ServicoDepositoPix {
    public Recibo efetuarDepsito(Cartao cartao, double valorDeposito) {
        cartao.depositar(valorDeposito);

        return new Recibo(cartao.getTitular(), "Depósito", valorDeposito);
    }
}
