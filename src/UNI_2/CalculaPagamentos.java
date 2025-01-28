package UNI_2;

import java.util.Scanner;

public class CalculaPagamentos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Qual o seu nome ?");
		String nome = entrada.nextLine();

		System.out.print("Qual é o seu valor por hora ?");
		float valorHora = entrada.nextFloat();

		System.out.print("Quantas horas você trabalhou ?");
		int horasTrabalhadas = entrada.nextInt();

		System.out.print("Qual é o valor dos descontos ?");
		float valorDescontos = entrada.nextFloat();

		float salarioLiquido = valorHora * horasTrabalhadas;
		float salarioBruto = salarioLiquido - valorDescontos;

		System.out.printf("Folha de pagamento: %s%n%d horas x R$%f = %f%nDescontos: R$%f%nTotal devido: R$%f", nome, horasTrabalhadas, valorHora, salarioLiquido, valorDesconto, salarioBruto);
	}
}
