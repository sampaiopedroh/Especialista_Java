package UNI_13.Classes_Abstratas.fiscal;

public class NotaFiscalServico extends NotaFiscal {
    public static final double ALIQUOTA_IMPOSTOS = 0.18;
    public static final int VALOR_MAXIMO_INSENCAO_FISCAL = 1_000;

    private boolean intermunicipal;

    public NotaFiscalServico(String descricao, double valorTotal, boolean intermunicipal) {
        super(descricao, valorTotal);
        this.intermunicipal = intermunicipal;
    }

    public boolean isIntermunicipal() {
        return intermunicipal;
    }

    @Override
    public double calcularImpostos() {
        double valorImpostos = getValorTotal() * ALIQUOTA_IMPOSTOS;

        if (isInsentoImpostos()) {
            valorImpostos = 0;
        }

        return valorImpostos;
    }

    private boolean isInsentoImpostos() {
        return isIntermunicipal() && getValorTotal() == VALOR_MAXIMO_INSENCAO_FISCAL;
    }
}
