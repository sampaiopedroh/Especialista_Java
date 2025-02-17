package UNI_5.Exercicios_02;

public class Holerite {
    Funcionario funcionario;
    double valorTotalHoras;
    double valorTotalHorasExtras;
    double adicioalFilhos;

    double calculaSalario() {
        return valorTotalHorasExtras + valorTotalHoras + adicioalFilhos;
    }

    void imprimir() {
        System.out.printf("Holerite:%n" +
                "----------%n" +
                "Nome: %s%n" +
                "Valor horas normais: R$%.2f%n" +
                "Valor horas extras: R$%.2f%n" +
                "Valor adicional para pais: R$%.2f%n" +
                "Salário: R$%.2f%n", funcionario.nome, valorTotalHoras, valorTotalHorasExtras, adicioalFilhos, calculaSalario());
    }
}