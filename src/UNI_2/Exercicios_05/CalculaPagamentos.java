package UNI_2.Exercicios_05;

import java.util.Scanner;

public class CalculaPagamentos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Qual o seu nome ?");
		String nome = entrada.nextLine();

		System.out.println("Qual é o seu valor por hora ?");
		float valorHora = entrada.nextFloat();

		System.out.println("Quantas horas você trabalhou ?");
		int horasTrabalhadas = entrada.nextInt();

		System.out.println("Qual é o valor dos descontos ?");
		float valorDescontos = entrada.nextFloat();

		float salarioLiquido = valorHora * horasTrabalhadas;
		float salarioBruto = salarioLiquido - valorDescontos;

		System.out.printf("%nFolha de pagamento: %s%n%d horas x R$%.2f = R$%.2f%nDescontos: R$%.2f%nTotal devido: R$%.2f%n", nome, horasTrabalhadas, valorHora, salarioLiquido, valorDescontos, salarioBruto);
	}
}
