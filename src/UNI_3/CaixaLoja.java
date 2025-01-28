package UNI_3;

import java.util.Scanner;

public class CaixaLoja {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Preço dos produtos: ");
		double precoProdutos = entrada.nextDouble();

		System.out.print("Vai querer retirar ? ");
		boolean cobrarFrete = entrada.nextBoolean();

		double valorTotal;

		if (!cobrarFrete) {
			System.out.print("Qual o valor do frete ? ");
			double valorFrete = entrada.nextDouble();

			valorTotal = precoProdutos + valorFrete;
		} else {
			valorTotal = precoProdutos;
		}

		System.out.printf("Valor total: R$%.2f%n", valorTotal);
	}
}
