package UNI_3;

import java.util.Scanner;

public class ControlePesoAeronave {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Peso máximo da aeronave: ");
		int pesoMaximo = entrada.nextInt();

		System.out.print("Quantidade de passageiros: ");
		int totalPassageiros = entrada.nextInt();

		int somaPesoPassageiros = 0;

		for (int passageiroAtual = 1; passageiroAtual <= totalPassageiros; passageiroAtual++) {
			System.out.printf("Peso do passageiro n˚%d: ", passageiroAtual);
			int pesoPassageiro = entrada.nextInt();

			somaPesoPassageiros += pesoPassageiro;
		}

		System.out.printf("Peso máximo da aeronave: %d kg%n", pesoMaximo);
		System.out.printf("Peso total dos passageiros: %d kg%n", somaPesoPassageiros);
		System.out.printf("Sistuação da aeronave: %s%n", 
		somaPesoPassageiros > pesoMaximo ? "Peso excedido" : "Tudo certo");
	}
}
