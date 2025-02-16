package UNI_4.Precificacao;

public class Principal {
    public static void main(String[] args) {
        Produto.custoEmbalagem = 10;
        Produto produto = new Produto();
//        produto.precoCusto = 100;
        produto.alterarPrecoCusto(80);

        ServicaoPrecificacao servicaoPrecificacao = new ServicaoPrecificacao();
        servicaoPrecificacao.definirPrecoVenda(produto, 20);

        System.out.printf("Preço de venda: %.2%n", produto.precoVenda);
        System.out.printf("Preço de custo: %.2%n", produto.precoCusto);
    }
}
