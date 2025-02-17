package UNI_5.Precificacao;

public class Produto {
    double precoCusto;
    double precoVenda;

    // custoEmbalagem não está atribuído ao Objeto, mas a Classe
    static double custoEmbalagem;

    void  alterarPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

   static void imprimirCustoEmbalagem() {
        System.out.printf("Custo com embalagem: %.2f%n", custoEmbalagem);
    }

    static void alterarCustoEmbalagem(double custoEmbalagem) {
        Produto.custoEmbalagem = custoEmbalagem;
    }

    static double calcularCustosTotais(Produto produto) {
        return produto.precoCusto + Produto.custoEmbalagem;
    }
}
