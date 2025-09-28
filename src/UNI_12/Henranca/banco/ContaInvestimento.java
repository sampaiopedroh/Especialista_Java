package UNI_12.Henranca.banco;

public class ContaInvestimento extends Conta{
    public ContaInvestimento(Titular titular, int agencia, int numero) {
        super(titular, agencia, numero);
    }

    private double valorTotalRendimentos;

    public double getValorTotalRendimentos() {
        return valorTotalRendimentos;
    }

    public void credtitarRendimentos(double percentualJuros) {
        double valorRendimentos = getSaldo() * percentualJuros / 100;
        this.valorTotalRendimentos += valorRendimentos;
        depositar(valorRendimentos);
    }

    @Override
    public String toString() {
        return "ContaInvestimento{" +
                "numero=" + getNumero() +
                ", agencia=" + getAgencia() +
                ", titular=" + getTitular() +
                ", valorTotalRendimentos=" + valorTotalRendimentos +
                '}';
    }
}
