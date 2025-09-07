package UNI_11.Sem_Encapsulamento.servico;

import UNI_11.Sem_Encapsulamento.Cartao;
import UNI_11.Sem_Encapsulamento.Recibo;

public class DepositoPixServico {
    public Recibo efeturaDeposito(Cartao cartao, double valorDeposito) {
        // TODO faz cobrança do valor no PIX

        if (valorDeposito < Cartao.VALOR_MINIMO_DEPOSITO) {
            throw new IllegalArgumentException(String.format("Valor de depósito não pose ser menor que %.2f", Cartao.VALOR_MINIMO_DEPOSITO));
        }

        cartao.saldo += valorDeposito - Cartao.TARIFA_DEPOSITO;

        return new Recibo(cartao.titular, "Depósito", valorDeposito);
    }
}
