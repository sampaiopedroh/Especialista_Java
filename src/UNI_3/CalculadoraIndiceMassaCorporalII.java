package UNI_3;

import java.util.Scanner;

public class CalculadoraIndiceMassaCorporal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Peso: ");
		double peso = entrada.nextDouble();

		System.out.print("Altura: ");
		double altura = entrada.nextDouble();

		double imc = peso / (altura * altura);

		boolean abaixoPesoIdeal = imc < 18.5;
		
		if (imc < 18.5) {
			System.out.println("Abaixo do peso ideal");
		} else if (imc < 25) {
			System.out.println("Peso ideal");
		} else {
			System.out.println("Acima do peso ou obesidade");
		}

		System.out.println("Fim do programa.");
	}
}
