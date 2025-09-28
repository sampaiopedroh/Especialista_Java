package UNI_12.Duplicando.banco;

public class ContaEspecial {
    private Titular titular;
    private int agencia;
    private int numero;
    private double saldo;
    private double valorTotalRendimentos;
    private double tarifaMensal;
    private double limiteChequeEspecial;


    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getSaldoDisponivel() {
        return getSaldo() + getLimiteChequeEspecial();
    }

    public double getValorTotalRendimentos() {
        return valorTotalRendimentos;
    }

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

    public void credtitarRendimentos(double percentualJuros) {
        double valorRendimentos = getSaldo() * percentualJuros / 100;
        this.valorTotalRendimentos += valorRendimentos;
        depositar(valorRendimentos);
    }

    public void sacar(double valorSaque) {
        if (valorSaque <= 0) {
            throw new IllegalArgumentException("Valor de saque deve ser maior que 0");
        } else if (valorSaque > getSaldoDisponivel()) {
            throw new RuntimeException("Saldo insuficiente para saque");
        }

        saldo -= valorSaque;
    }

    public void depositar(double valorDeposito) {
        if (valorDeposito <= 0) {
            throw new IllegalArgumentException("Valor do depósito deve ser maior que 0");
        }

        saldo += valorDeposito;
    }

    public void imprimirDemonstrativo() {
        System.out.println();
        System.out.printf("Agência: %d%n", getAgencia());
        System.out.printf("Conta: %d%n", getNumero());
        System.out.printf("Titular: %s%n", getTitular().getNome());
        System.out.printf("Saldo: R$%.2f%n", getSaldo());
        System.out.printf("Saldo disponível: R$%.2f%n", getSaldoDisponivel());

    }

    public void debitarTarifaMensal() {
        sacar(getTarifaMensal());
    }
}
