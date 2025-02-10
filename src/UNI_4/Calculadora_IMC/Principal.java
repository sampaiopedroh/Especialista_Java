package UNI_4.Calculadora_IMC;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Paciente paciente = new Paciente();
        System.out.println("Diga a sua altura: ");
        paciente.altura = entrada.nextDouble();
        System.out.println("Diga o seu peso: ");
        paciente.peso = entrada.nextDouble();

        IndiceMassaCorporal imc = new IndiceMassaCorporal();

        if (imc.estaComObesidade()) {
            System.out.printf("Pacientecom alura de %.2f e peso de %.2f" +
                    "está com obesidade%n", imc.altura, imc.resultado);
        }

        System.out.printf("IMC: %.2f%n", imc.resultado);
    }
}
