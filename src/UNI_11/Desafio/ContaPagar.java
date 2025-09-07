package UNI_11.Desafio;

public class ContaPagar {
    private Fornecedor fornecedor;
    private String descricao;
    private double valor;
    private String dataVencimento;
    private boolean pago;

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public void pagar() {
        if (isPago()) {
            throw new RuntimeException("Está conta já foi paga");
        }
        setPago(true);
    }

    public void cancelarPagamento() {
        if (isPago()) {
            setPago(false);
        }
        throw new RuntimeException("Essa conta não foi paga, não há pagamentos para cancelar");
    }
}
