package UNI_8.Exercicios_03;

import java.util.ArrayList;
import java.util.Arrays;

public class MatematicaUtils {
    static void calcularMedia(double numero1, double numero2, Double... numerosAdicionais) {
        ArrayList<Double> numeros = new ArrayList<>();
        numeros.add(numero1);
        numeros.add(numero2);
        double total = 0.0;
        for (Double numeroAdicional : numerosAdicionais) {
            numeros.add(numeroAdicional);
        }
        for (Double numero : numeros) {
            total += numero;
        }
        total /= numeros.size();
        System.out.printf("Média dos %d números: %.2f%n", numeros.size(), total);
    }
}
