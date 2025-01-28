package UNI_2;

import java.util.Scanner;

public class IndiceMassaCorporal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Nome: ");
		String nome = entrada.nextLine();

		System.out.print("Peso: ");
		float peso = entrada.nextFloat();

		System.out.print("Altura: ");
		float altura = entrada.nextFloat();

		float imc = peso / (altura * altura);
		System.out.printf("%s, seu IMC é de: %.2f%n", nome, imc);
	}
}
