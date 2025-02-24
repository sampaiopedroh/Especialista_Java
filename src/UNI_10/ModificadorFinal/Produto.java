package UNI_10.ModificadorFinal;

import java.util.Objects;
import java.util.UUID;

public class Produto {
    static final int QUANTIDADE_ESTOQUE_PADRAO = 10;

    String nome;
    int quantidadeEstoque;
    final UUID codigo;

    Produto(String nome, int quantidadeInicial) {
        Objects.requireNonNull(nome, "Nome não pode ser null");
        this.nome = nome;

        if (quantidadeInicial < 0) {
            throw new IllegalArgumentException("Estoque não pode ser negativo");
        }
        this.quantidadeEstoque = quantidadeInicial;

        this.codigo = UUID.randomUUID();
    }

    Produto(String nome) {
        this(nome, QUANTIDADE_ESTOQUE_PADRAO);
        this.quantidadeEstoque = QUANTIDADE_ESTOQUE_PADRAO;
    }

    Produto() {
        this("Não identificado");
    }
}
