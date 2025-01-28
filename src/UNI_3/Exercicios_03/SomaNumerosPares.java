package UNI_3.Exercicios_03;

import java.util.Scanner;

public class SomaNumerosPares {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int somaNumerosPares = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.printf("Diga o n˚%d: ", i);
			int numeroEscolhido = entrada.nextInt();
			if (numeroEscolhido % 2 == 0) {
				somaNumerosPares += numeroEscolhido;
			} else {
				System.out.println("O número escolhido não é par, escolha outro.");
				i--;
			}
		}

		System.out.printf("A soma dos seus números pares é: %d%n", somaNumerosPares);
	}
}
