package UNI_10.Exercicios_01;

public class Participante {
    String nome;
    int saldoDePontos;

    static final int QUANTIDADE_PADRAO_INICIAL_PONTOS= 0;

    Participante(String nome, int saldoDePontosInicial) {
        this.nome = nome;
        this.saldoDePontos = saldoDePontosInicial;
    }

    Participante(String nome) {
        this(nome, QUANTIDADE_PADRAO_INICIAL_PONTOS);
    }
}
