package UNI_8.Exercicios_01.Parte_II;

import java.util.Arrays;

public class Cardapio {
    ItemCardapio[] itens = new ItemCardapio[0];

    void adicionarItem(ItemCardapio item) {
        this.itens = Arrays.copyOf(this.itens, this.itens.length + 1);
        this.itens[itens.length - 1] = item;
    }

    void removerItem(int indice) {
        ItemCardapio[] novoCardapio = new ItemCardapio[itens.length - 1];
        System.arraycopy(this.itens, 0, novoCardapio, 0, indice);
        System.arraycopy(this.itens, indice + 1, novoCardapio, indice, novoCardapio.length - indice);
        itens = novoCardapio;
    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
        for (int i = 0; i < this.itens.length; i++) {
            if (itens[i].preco > precoMinimo && itens[i].preco < precoMaximo){
                System.out.printf("Produto: %s - Preço: %.2f%n", itens[i].descricao, itens[i].preco);
            }
        }

    }
}
