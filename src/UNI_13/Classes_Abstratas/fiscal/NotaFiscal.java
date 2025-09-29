package UNI_13.Classes_Abstratas.fiscal;

public abstract class NotaFiscal {
    private String descricao;
    private double valorTotal;

    public NotaFiscal(String descricao, double valorTotal) {
        this.descricao = descricao;
        this.valorTotal = valorTotal;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public abstract double calcularImpostos();

    public void emitir() {
        System.out.printf("Emitindo nota fiscal para: %s%n" +
                            "Valor total: R$%.2f%n" +
                            "Impostos: R$%.2f%n", getDescricao(), getValorTotal(), calcularImpostos());
    }
}
