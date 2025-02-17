package UNI_6.Comentarios;

public class Contribuinte {
    static final int IDADE_MINIMA_APOSENTADORIA = 65;

    // De bons nomes ao invés de comentar sobre o nome do atributo
    int idade;
    int tempoContribuicaoEmAnos;

    boolean estaElegivelParaAposentadoria() {
        return this.idade >= IDADE_MINIMA_APOSENTADORIA;
    }
}
