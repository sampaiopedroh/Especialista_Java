package UNI_3;

import java.util.Scanner;

public class HorarioFuncionamento {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um dia da semana, com apenas 3 letras: ");
		String dia = entrada.nextLine();
		String horarioFuncionamento;

		switch (dia) {
			case "seg":
			case "ter":
			case "qua":
			case "qui":
			// pode ser assim também:
			// case "sex" -> horarioFuncionamento = "8-18h";
			case "sex":
				horarioFuncionamento = "8h-18h";
				break;
			case "sáb":
			case "dom":
				horarioFuncionamento = "Fechado";
				break;
			default:
				horarioFuncionamento = "Esse dia não existe";
				break;
		}

		System.out.printf("Horário de funcionamento: %s%n", horarioFuncionamento);
	}
}
