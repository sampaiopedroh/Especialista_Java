package UNI_3;

import java.util.Scanner;

public class ExamaVitaminaD {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Grupo de risco: ");
		boolean grupoDeRisco = entrada.nextBoolean();

		System.out.print("Vitamina D: ");
		double vitaminaD = entrada.nextDouble(); // nanograma por mililitro

		// Desejável: > 20 ng/mL
		// Grupo de risco: 30<x>60 ng/mL
		
		boolean vitaminaDNormal = (!grupoDeRisca && vitaminaD > 20) || (grupoDeRisco && vitaminaD >= 30 && vitaminaD <= 60);
		// grupoDeRisco == false é igual a !grupoDeRisco
		// grupoDeRisco == true é igual a grupoDeRisco

		System.out.printf("Vitamina D normal: %b%n", vitaminaDNormal);
	}
}
