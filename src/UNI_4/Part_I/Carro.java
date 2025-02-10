package UNI_4.Part_I;

public class Carro {
    String fabricante = "Sem fabricante";
    String modelo = "Sem modelo";
    String cor = "Sem cor";
    int anoFabricacao = 9_999;
    double precoCompra = 9_999_999.9;

    Pessoa proprietario;

    void imprimirResumoDepreciacao() {
        int tempoDeUsoMeuCarro = calcularTempoDeUsoEmAnos();
        double valorRevendaMeuCarro = calcularValorRevenda();
        double valorIpva = calcularIpva();

        if (precoCompra <= 0) {
            System.out.println("Carro co preço de compra zerado. " +
                    "Não foi possível imprimir resumo de depreciação.");
            return;
        }

        System.out.printf("Tempo de uso (anos): %d%n", 2025 - tempoDeUsoMeuCarro);
        System.out.printf("Valor de revenda: R$%.2f%n", valorRevendaMeuCarro);
        System.out.printf("Valor do IPVA: %.2f%n", valorIpva);
    }

    double calcularIpva() {
        int tempoDeUsoEmAnos = calcularTempoDeUsoEmAnos();
        if (tempoDeUsoEmAnos >= 10) {
            return 0;
        }
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
