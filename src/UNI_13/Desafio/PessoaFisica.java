package UNI_13.Desafio;

public class PessoaFisica extends Pessoa {
    public static final double RECEITA_ANUAL_ISENCAO = 50_000;
    public static final double ALIQUOTA_IMPOSTO_RENDA = 0.2;

    private double receitaAnual;

    public PessoaFisica(String nome, double receitaAnual) {
        super(nome);
        this.receitaAnual = receitaAnual;
    }

    public double getReceitaAnual() {
        return receitaAnual;
    }

    @Override
    public double calcularImpostos() {
        double calculo = receitaAnual * ALIQUOTA_IMPOSTO_RENDA;

        if (calculo > RECEITA_ANUAL_ISENCAO) {
            return calculo;
        }

        return 0;
    }
}
