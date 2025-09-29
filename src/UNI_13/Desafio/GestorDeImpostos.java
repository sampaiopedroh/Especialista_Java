package UNI_13.Desafio;

public class GestorDeImpostos {
    private double valorTotalImpostos;

    public double getValorTotalImpostos() {
        return valorTotalImpostos;
    }

    public void adicionar(Pessoa... pessoas) {
        for (Pessoa pessoa : pessoas) {
            double valorImpostosCalculados = pessoa.calcularImpostos();
            System.out.printf("Impostos devidos de %s: %.2f%n",
                    pessoa.getNome(), valorImpostosCalculados);
            valorTotalImpostos += valorImpostosCalculados;
        }
    }
}
