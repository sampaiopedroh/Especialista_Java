package UNI_3.Exercicios_03;

import java.util.Scanner;

public class SomaNumeros {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int somaNumeros = 0;

		while (somaNumeros < 99) {
			System.out.print("Diga um número: ");
			int numeroEscolhido = entrada.nextInt();
		
			somaNumeros += numeroEscolhido;
		}

		System.out.printf("A soma dos números resulta em: %d%n", somaNumeros);
	}
}
