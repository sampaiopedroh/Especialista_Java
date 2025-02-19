package UNI_8.ComecandoArrays;

import java.util.Arrays;
import java.util.Comparator;

public class Principal {
    public static void main(String[] args) {
        // Array com 5 elementos, sendo os elementos não definidos (0)
        // int[] notas = new int[5];

        // Array com elementos definidos, que já define a quantidade de elementos
        //int[] notas = new int[]{8, 5, 4, 9, 10};

        // Outro jeito
        // int[] notas = {8, 5, 4, 9, 10};
        Integer[] notas = {8, 5, 4, 9, 10};

        /*
        // Atribuindo valores
        notas[0] = 10;

        // Consultando valores
        System.out.println(notas[0]);

        int posicao = 2;
        System.out.println(notas[posicao]);
        System.out.println(notas[posicao - 1]);
        */

        // Iteração
        // double media = Calculadora.calcularMedia(notas);
        // System.out.println(media);

        // Print dos valores da array
        String notasEmString = Arrays.toString(notas);
        System.out.println(notasEmString);

        // Ordenando crescentemente os números na array
        Arrays.sort(notas);
        System.out.println(Arrays.toString(notas));

        // Decrescente (só funciona com classes, por isso a lista está como Interger)
        Arrays.sort(notas, Comparator.reverseOrder());
        System.out.println(Arrays.toString(notas));
    }
}
