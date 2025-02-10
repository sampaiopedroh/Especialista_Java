package UNI_4;

public class Carro {
    String fabricante = "Sem fabricante";
    String modelo = "Sem modelo";
    String cor = "Sem cor";
    int anoFabricacao = 9_999;
    double precoCompra = 9_999_999.9;

    Pessoa proprietario;

    void imprimirResumoDepreciacao() {
        System.out.printf("Tempo de uso (anos): %d%n", 2025 - calcularTempoDeUsoEmAnos());
        System.out.printf("Valor de revenda: R$%.2f%n", calcularValorRevenda());
        System.out.printf("Valor do IPVA: %.2f%n", calcularIpva());
    }

    double calcularIpva() {
        return calcularValorRevenda() * 0.04;
    }

    int calcularTempoDeUsoEmAnos() {
        return 2025 - anoFabricacao;
    }

    double calcularValorRevenda() {
        int vidaUtilEmAnos = 20;
        double valorRevenda = (precoCompra / vidaUtilEmAnos) * (vidaUtilEmAnos - calcularTempoDeUsoEmAnos());

        if (valorRevenda < 0) {
            valorRevenda = 0;
        }

        return valorRevenda;
    }
}
