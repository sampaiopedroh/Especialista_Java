package UNI_3;

import java.util.Scanner;

public class CalculadoraImpostos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		char tipoNotaFiscal = 'P';
		double totalFaturado = 1_200.30;

		/*
		double valorImpostos;

		if (tipoNotaFiscal == 'P') {
			valorImpostos = totalFaturado * 0.16;
		} else {
			valorImpostos = totalFaturado = 0.35;
		}
		*/

		double valorImpostos = tipoNotaFiscal == 'P' ? totalFaturado * 0.16 : totalFaturado * 0.35;

		System.out.printf("Total faturado: R$%.2f%n", totalFaturado);
		System.out.printf("Valor dos impostos: R$%.2f%n", valorImpostos);
	}
}
