package UNI_5.Exercicios_02;

public class ContratoTrabalho {
    Funcionario funcionario;
    double valorHoras ;
    double valorHorasExtras;

    boolean temAdicionalFilhos() {
        return funcionario.temFilhos();
    }
}
