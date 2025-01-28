package UNI_3.Exercicios_01;

import java.util.Scanner;

public class VerificaAnoBissexto {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Diga um ano: ");
		int ano = entrada.nextInt();

		boolean anoBissexto = (ano % 400 == 0 || ano % 4 == 0) && ano % 100 != 0;
		System.out.printf("O ano %d, é bissexto: %b%n", ano, anoBissexto);
	}
}
