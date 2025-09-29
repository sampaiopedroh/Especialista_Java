package UNI_13.Desafio;

public class EmpresaSimples extends PessoaJuridica {
    public static final double ALIQUOTA_IMPOSTOFATURAMENTO = 0.06;

    public EmpresaSimples(String nome, double faturamentoAnual, double despesaAnual) {
        super(nome, faturamentoAnual, despesaAnual);
    }

    @Override
    public double calcularImpostos() {
        return getFaturamentoAnual() * ALIQUOTA_IMPOSTOFATURAMENTO;
    }
}
