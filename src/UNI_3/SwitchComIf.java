package UNI_3;

import java.util.Scanner;

public class SwitchComIf {
	public static void main(String[] args) {
		Scanner entrada  = new Scanner(System.in);

		System.out.print("Diga o dia, só com os números: ");
		int dia = entrada.nextInt();

		System.out.print("Diga o mês, só com os números: ");
		int mes = entrada.nextInt();

		String diaDaSemana = switch (dia) {
			case 1:
			if (mes == 1) {
				yield "Segunda";
			} else {
				yield "Terça";
			}
			default:
				yield "É só um teste";
		};
		
		System.out.printf("O dia da semana é: %s%n", diaDaSemana);
	}	
}
