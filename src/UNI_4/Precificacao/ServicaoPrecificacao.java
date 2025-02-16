package UNI_4.Precificacao;

public class ServicaoPrecificacao {
    void definirPrecoVenda(Produto produto, double percentualMargemLucro) {
        double precoVendaCalculado = Matematica.calcularaAcrescimo(produto.precoCusto, percentualMargemLucro);
        precoVendaCalculado += Produto.custoEmbalagem;

        produto.precoVenda = precoVendaCalculado;
    }
}
