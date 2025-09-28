package UNI_12.Desafio;

public record Holerite(String nome, String mesAno, double valorSalario) {
    public void imprimir() {
        System.out.printf("Holerite de %s:%n" +
                            "Mês/Ano: %s%n" +
                            "Valor salário: R$%.2f%n", nome, mesAno, valorSalario);
    }
}
