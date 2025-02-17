package UNI_6.Classes;

public class Fornecedor {
    static final double TAXA_LIMITE_CREDITO = 0.1;
    static final double LIMITE_CREDITO_MINIMO = 10_000;

    String razaoSocial;
    double faturamentoAnual;

    double calcularLimiteCredito() {
        double limiteCredito = this.faturamentoAnual * TAXA_LIMITE_CREDITO;

        if (limiteCredito < LIMITE_CREDITO_MINIMO) {
            limiteCredito = LIMITE_CREDITO_MINIMO;
        }

        return limiteCredito;
    }
}
