package UNI_4.Exercicios_02;

public class FolhaPagamento {
        Holerite calcularSalario(int horasTrabalhadas, int horasExtrasTrabalhadas, ContratoTrabalho contrato) {
            Holerite holerite = new Holerite();
            holerite.valorTotalHoras = contrato.valorHoras * horasTrabalhadas;
            holerite.valorTotalHorasExtras = contrato.valorHorasExtras * horasExtrasTrabalhadas;
            holerite.funcionario = contrato.funcionario;

            if (contrato.temAdicionalFilhos()) {
                holerite.adicioalFilhos = (holerite.valorTotalHoras + holerite.valorTotalHorasExtras) / 10;
            }

            return holerite;
        }
}
