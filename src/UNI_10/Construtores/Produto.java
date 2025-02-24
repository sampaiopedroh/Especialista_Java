package UNI_10.Construtores;

import java.util.Objects;

public class Produto {
    String nome;
    int quantidadeEstoque;

    static final int QUANTIDADE_ESTOQUE_PADRAO = 10;

//    Produto(String nome, int quantidadeInicial) {
//        Objects.requireNonNull(nome, "Nome não pode ser null");
//        this.nome = nome;
//        if (quantidadeInicial < 0) {
//            throw new IllegalArgumentException("Estoque não pode ser negativo");
//        }
//        this.quantidadeEstoque = quantidadeInicial;
//    }
//
//    Produto(String nome) {
//        Objects.requireNonNull(nome, "Nome não pode ser null");
//        this.nome = nome;
//        this.quantidadeEstoque = QUANTIDADE_ESTOQUE_PADRAO;
//    }
//
//    Produto() {
//        this.nome = "Não identificado";
//        this.quantidadeEstoque = QUANTIDADE_ESTOQUE_PADRAO;
//    }

    Produto(String nome, int quantidadeInicial) {
        Objects.requireNonNull(nome, "Nome não pode ser null");
        this.nome = nome;
        if (quantidadeInicial < 0) {
            throw new IllegalArgumentException("Estoque não pode ser negativo");
        }
        this.quantidadeEstoque = quantidadeInicial;
    }

    Produto(String nome) {
        this(nome, QUANTIDADE_ESTOQUE_PADRAO);
        this.quantidadeEstoque = QUANTIDADE_ESTOQUE_PADRAO;
    }

    Produto() {
        this("Não identificado");
    }
}
