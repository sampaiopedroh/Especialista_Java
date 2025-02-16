package UNI_4.Precificacao;

public class Principal2 {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        // Maneira errada de mudar o valor de uma variável global
        produto1.custoEmbalagem = 10;
        produto2.custoEmbalagem = 15;

        // Jeito certo
        // Produto.custoEmbalagem = 20;

        // Não é uma boa prática
        Produto.alterarCustoEmbalagem(12);

        Produto.imprimirCustoEmbalagem();
    }
}
