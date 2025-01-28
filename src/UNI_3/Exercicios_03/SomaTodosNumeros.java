package UNI_3.Exercicios_03;

import java.util.Scanner;

public class SomaTodosNumeros {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int somaNumeros = 0;
		
		boolean continuar;

		do {
			System.out.print("Diga um número: ");
			int numeroEscolhido = entrada.nextInt();

			somaNumeros += numeroEscolhido;
			
			System.out.print("Quer continuar ? ");
			continuar = entrada.nextBoolean();
		} while (continuar);

		System.out.printf("A soma dos números resultou em: %d%n", somaNumeros);
	}
}
