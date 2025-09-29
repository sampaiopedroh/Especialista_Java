package UNI_13.Polimorfismo.banco;

import java.util.Objects;

public class ContaSalario extends Conta{
    private double salarioMensal;

    public ContaSalario(Titular titular, int agencia, int numero, double salarioMensal) {
        super(titular, agencia, numero);
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    @Override
    public String toString() {
        return "ContaSalario{" +
                "salarioMensal=" + salarioMensal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ContaSalario that = (ContaSalario) o;
        return Double.compare(salarioMensal, that.salarioMensal) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), salarioMensal);
    }
}
