package UNI_3.Exercicios_03;

import java.util.Scanner;

public class VerificaPrimo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Diga um número possitivo inteiro: ");
		int numeroEscolhido = entrada.nextInt();


		if (numeroEscolhido > 1){
			boolean primo = true;

			for (int i = numeroEscolhido - 1; i > 1; i--) {
				if (numeroEscolhido % i == 0) {
					primo = false;
					break;
				} 
			}

			System.out.printf("O número escolhido é primo ? %s%n", primo ? "Primo" : "False");
		} else {
			System.out.printf("O número \"%d\" não é válido%n", numeroEscolhido);
		}

	}
}
