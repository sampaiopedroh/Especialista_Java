package UNI_8.CopiandoExpandindo;

import java.util.Arrays;

public class Principal1 {
    public static void main(String[] args) {
        // Copiando uma array, até com a quantidade que quiser
        int[] numerosJogos1 = {25, 11, 8, 46, 37, 14};
        int[] numerosJogos2 = Arrays.copyOf(numerosJogos1, 3);

        System.out.println(Arrays.toString(numerosJogos1));
        System.out.println(Arrays.toString(numerosJogos2));

        // Também é possível expandir e atribuir um valor
        int[] numerosJogos3 = Arrays.copyOf(numerosJogos1, numerosJogos1.length + 1);
        numerosJogos3[numerosJogos3.length - 1] = 13;
        System.out.println(Arrays.toString(numerosJogos3));
    }
}
