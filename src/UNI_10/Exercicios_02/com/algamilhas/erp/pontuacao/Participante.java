package UNI_10.Exercicios_02.com.algamilhas.erp.pontuacao;

public class Participante {
    private String nome;
    private int saldoDePontos;

    static final int QUANTIDADE_PADRAO_INICIAL_PONTOS= 0;

    private Participante(String nome, int saldoDePontosInicial) {
        this.nome = nome;
        this.saldoDePontos = saldoDePontosInicial;
    }

     public Participante(String nome) {
        this(nome, QUANTIDADE_PADRAO_INICIAL_PONTOS);
    }

    public void creditarPontos(int pontos) {
        if (pontos < 0) {
            throw new IllegalArgumentException("Não pode ser atribuído pontos negativos");
        }
        this.saldoDePontos += pontos;
    }
}
