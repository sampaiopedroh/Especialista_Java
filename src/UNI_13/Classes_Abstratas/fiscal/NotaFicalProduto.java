package UNI_13.Classes_Abstratas.fiscal;

public class NotaFicalProduto extends NotaFiscal {
    public static final double ALIQUOTA_IMPOSTOS_FEDERAIS = 0.18;
    public static final double ALIQUOTA_IMPOSTOS_ESTADUAIS = 0.12;

    private double valorFrete;

    public NotaFicalProduto(String descricao, double valorTotal, double valorFrete) {
        super(descricao, valorTotal);
        this.valorFrete = valorFrete;
    }

    public double getValorFrete() {
        return valorFrete;
    }

    @Override
    public double calcularImpostos() {
        double valorImpostos = getValorTotal() * ALIQUOTA_IMPOSTOS_FEDERAIS;
        valorImpostos += getValorTotal() * ALIQUOTA_IMPOSTOS_ESTADUAIS;

        return valorImpostos;
    }
}
