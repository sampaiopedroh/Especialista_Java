package UNI_3;

import java.util.Scanner;

public class AvaliacaoAtendimento {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Avalie o nosso atendimento, de 1 a 5: ");
		int nota = entrada.nextInt();
		
		String descricaoNota;
		
		switch (nota) {
			case 1:
				descricaoNota = "Muito ruim";
				break;
			case 2:
				descricaoNota = "Ruim";
				break;
			case 3:
				descricaoNota = "Razoável";
				break;
			case 4:
				descricaoNota = "Bom";
				break;
			case 5:
				descricaoNota = "Muito bom";
				break;
			default:
				descricaoNota = "Valor inválido";
				break;
		}

		/*
		switch (nota) {
			case 1:
				descricaoNota = "Muito ruim";
			case 2:
				decricaoNota = "Ruim";
			case 3:
				descricaoNota = "Razoável";
			case 4:
				descricaoNota = "Bom";
			case 5:
				descricaoNota = "Muito bom";
			default:
				descricaoNota = "Valor inválido";
		}
		

		
		if (nota == 1) {
			descricaoNota = "Muito ruim";
		} else if (nota == 2) {
			decricaoNota = "Ruim";
		} else if (nota == 3) {
			descricaoNota = "Razoável";
		} else if (nota == 4) {
			descricaoNota = "Bom";
		} else if (nota == 5) {
			descricaoNota = "Muito bom";
		} else {
			descricaoNota = "Valor inválido";
		}
		*/

		System.out.printf("Sua nota foi: %d - %s%n", nota, descricaoNota);
	}
}
