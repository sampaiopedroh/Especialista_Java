package UNI_4.Exercicios_02;

public class Principal {
    public static void main(String[] args) {
        Funcionario pedro = new Funcionario();
        pedro.nome = "Pedro";
        pedro.quantidadeFilhos = 0;

        ContratoTrabalho contratoPedro = new ContratoTrabalho();
        contratoPedro.funcionario = pedro;
        contratoPedro.valorHoras = 20;
        contratoPedro.valorHorasExtras = 10;

        FolhaPagamento folhaPagamento = new FolhaPagamento();

        Holerite holerite = folhaPagamento.calcularSalario(6, 1, contratoPedro);
        holerite.imprimir();
    }
}
