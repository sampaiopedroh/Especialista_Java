package UNI_5.Portaria;

public class Visitante {
    String nome;
    int idade;
    static final int IDADE_MINIMA_IRRESTRITO = 18;

    boolean possuiAcessoRestritoPorIdade() {
        return idade < IDADE_MINIMA_IRRESTRITO;
    }
}
