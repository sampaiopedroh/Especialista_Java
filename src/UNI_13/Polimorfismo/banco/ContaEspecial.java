package UNI_13.Polimorfismo.banco;

public final class ContaEspecial extends ContaInvestimento {
    public ContaEspecial(Titular titular, int agencia, int numero, double tarifaMensal) {
        super(titular, agencia, numero);
        this.tarifaMensal = tarifaMensal;
    }

    private double tarifaMensal;
    private double limiteChequeEspecial;

    public double getTarifaMensal() {
        return tarifaMensal;
    }

    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getSaldoDisponivel() {
        return getSaldo() + getLimiteChequeEspecial();
    }

    public void debitarTarifaMensal() {
        sacar(getTarifaMensal());
    }

    @Override
    protected void validarSaldoParaSaque(double valorSaque) {
        if (valorSaque > getSaldoDisponivel()) {
            throw new RuntimeException("Saldo insuficiente para saque");
        }
    }

    @Override
    public void imprimirDemonstrativo() {
        super.imprimirDemonstrativo();
        System.out.printf("Saldo disponível: R$%.2f%n", getSaldoDisponivel());
    }

    @Override
    public String toString() {
        return "ContaEspecial{" +
                "numero=" + getNumero() +
                ", agencia=" + getAgencia() +
                ", titular=" + getTitular() +
                ", valorTotalRendimentos=" + getValorTotalRendimentos() +
                ", tarifaMensal=" + tarifaMensal +
                ", limiteChequeEspecial=" + limiteChequeEspecial +
                '}';
    }
}
