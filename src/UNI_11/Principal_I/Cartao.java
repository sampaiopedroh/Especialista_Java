package UNI_11.Principal_I;

import java.io.Serializable;

public class Cartao implements Serializable {
    public static final double TARIFA_DEPOSITO = 0.1;
    public static final double VALOR_MINIMO_DEPOSITO = 50;

    private String titular;
    private double saldo;

    public Cartao() {}

    public Cartao(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void debitar(double valorDebito) {
        if (getSaldo() < valorDebito) {
            throw new RuntimeException("Saldo insuficiente para pagamento");
        }

        setSaldo(saldo - valorDebito);
    }

    public void depositar(double valorDeposito) {
        if (valorDeposito < VALOR_MINIMO_DEPOSITO) {
            throw new IllegalArgumentException(String.format("Valor de depósito não pose ser menor que %.2f", Cartao.VALOR_MINIMO_DEPOSITO));
        }

        setSaldo(saldo + VALOR_MINIMO_DEPOSITO - TARIFA_DEPOSITO);
    }
}
