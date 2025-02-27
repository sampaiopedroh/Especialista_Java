package UNI_11.FaltaDeEncapsulamento;

import java.io.Serializable;

public class Cartao implements Serializable {
    public static final double TARIFA_DEPOSITO = 0.1;
    public static final double VALOR_MINIMO_DEPOSITO = 50;

    private String titular;
    private double saldo;

    public Cartao(String titular) {
        this.titular = titular;
    }

    public Cartao() {
    }

    public String getTitular() {
        return titular;
    }

    public String setTitular(String titular) {
        return this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void debitar(double valorDebito) {
        if (getSaldo() < valorDebito) {
            throw new RuntimeException("Saldo insuficiente");
        }
        this.saldo -= valorDebito;
    }

    public void depositar(double valorDeposito) {
        if (valorDeposito < VALOR_MINIMO_DEPOSITO) {
            throw new IllegalArgumentException(String.format("Valor de deposito não pode ser menor que %.2f", VALOR_MINIMO_DEPOSITO));
        }
        this.saldo += valorDeposito - TARIFA_DEPOSITO;
    }
}
