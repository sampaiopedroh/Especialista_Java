package UNI_2;

public class OperadoresAritmeticos {
	public static void main(String[] args) {
		int minhaIdade = 19;
		int suaIdade = 20;

		// Adição
		int totalIdades = minhaIdade + suaIdade;
		System.out.println("Total das idades: " + totalIdades);

		// Subtração
		int diferencaIdades = suaIdade - minhaIdade;
		System.out.println("Diferença das idades: " + diferencaIdades);

		// Multiplicação
		int dobroIdade = 2 * minhaIdade;
		System.out.println("Dobro da minha idade: " + dobroIdade);

		// Divisão (inteira)
		int metadeIdade = minhaIdade / 2;
		System.out.println("Metade (inteira) da minha idade: " + metadeIdade);

		// Resto da divisão
		int restoDivisao = minhaIdade % 2;
		System.out.println("Resto da metade da minha idade: " + restoDivisao);
	}
}
