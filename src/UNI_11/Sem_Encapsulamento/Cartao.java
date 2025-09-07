package UNI_11.Sem_Encapsulamento;

public class Cartao {
    public static final double TARIFA_DEPOSITO = 0.1;
    public static final double VALOR_MINIMO_DEPOSITO = 50;

    public String titular;
    public double saldo;

    public Cartao(String titular) {
        this.titular = titular;
    }
}
