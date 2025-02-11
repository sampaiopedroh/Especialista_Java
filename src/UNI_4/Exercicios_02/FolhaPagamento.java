package UNI_4.Exercicios_02;

public class FolhaPagamento {
    double calcularSalario(DadosFuncionario funcionario) {
        double valorHorasTrabalhadas = funcionario.horasTrabalhadas * funcionario.valorHora;
        double valorHorasExtrasTrabalhadas = funcionario.horasExtras * funcionario.valorHoraExtra;

        double salario = valorHorasTrabalhadas + valorHorasExtrasTrabalhadas;
    }
}
