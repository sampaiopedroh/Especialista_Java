package UNI_2;

import java.util.Scanner;

public class EntradaDeDados {
	public static void main(String[] args) {
		// Scanner para escutar a entrada de dados do sistemas (System.in) 
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual o seu nome ?");

		String nome = entrada.nextLine();

		System.out.printf("Olá, %s%n", nome);
	}
}
