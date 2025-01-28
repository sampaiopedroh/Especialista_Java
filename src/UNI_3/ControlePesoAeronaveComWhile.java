package UNI_3;

import java.util.Scanner;

public class ControlePesoAeronaveComWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Peso máximo da aeronave: ");
		int pesoMaximo = entrada.nextInt();

		int somaPesoPassageiros = 0;

		boolean incluirNovoPassageiro = true;

		while (somaPesoPassageiros <= totalMaximo && incluirNovoPassageiro) {
			System.out.printf("Peso do passageiro: ");
			int pesoPassageiro = entrada.nextInt();

			somaPesoPassageiros += pesoPassageiro;

			System.out.print("Incluir novo passageiro ? ");
			incluirNovoPassageiro = entrada.nextBoolean();
		}

		System.out.printf("Peso máximo da aeronave: %d kg%n", pesoMaximo);
		System.out.printf("Peso total dos passageiros: %d kg%n", somaPesoPassageiros);
		System.out.printf("Sistuação da aeronave: %s%n", 
		somaPesoPassageiros > pesoMaximo ? : "Peso excedido" : "Tudo certo");
	}
}
