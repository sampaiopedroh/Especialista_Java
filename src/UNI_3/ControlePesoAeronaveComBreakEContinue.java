package UNI_3;

import java.util.Scanner;

public class ControlePesoAeronaveComBreakEContinue {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Peso máximo da aeronave: ");
		int pesoMaximo = entrada.nextInt();

		int somaPesoPassageiros = 0;

		while (true) {
			System.out.println("Peso do passageiro: ");
			int pesoPassageiro = entrada.nextInt();

			if (somaPesoPassageiros + pesoPassageiro > pesoMaximo) {
				System.out.println("Não pôde incluir passageiro. Peso excederia o Máximo");
				continue;
			}

			somaPesoPassageiros += pesoPassageiro;

			System.out.print("Incluir novo passageiro ? ");
			if (!entrada.nextBoolean()) {
				break;
			}
		}

		System.out.printf("Peso máximo da aeronave: %d kg%n", pesoMaximo);
		System.out.printf("Peso total dos passageiros: %d kg%n", somaPesoPassageiros);
		System.out.printf("Sistuação da aeronave: %s%n", 
		somaPesoPassageiros > pesoMaximo ? "Peso excedido" : "Tudo certo");
	}
}
