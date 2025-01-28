package UNI_3.Exercicios_03;

import java.util.Scanner;

public class InverteNumero {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Diga um número: ");
		int numeroEscolhido = entrada.nextInt();

		int numeroPendente = numeroEscolhido;
		int numeroInvertido = 0;
		
		while (numeroPendente > 0) {
			int resto = numeroPendente % 10;
			numeroInvertido = numeroInvertido * 10 + resto;
			numeroPendente /= 10;
		}

		System.out.printf("Seu número invertido é: %d%n", numeroInvertido);
	}
}
