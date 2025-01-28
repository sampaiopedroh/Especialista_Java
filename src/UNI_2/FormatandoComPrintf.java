package UNI_2;

public class FormatandoComPrintf {
	public static void main(String[] args) {
		String nome1 = "Pedro";
		System.out.println("Olá " + nome1);
		
		// %s para colocar uma string
		// %n para ficar no lugar do ln do println
		System.out.printf("Meu nome é: %s%n", nome1);

		// %d para colocar um inteiro
		int idade = 19;
		System.out.printf("Minha idade é: %d%n", idade);
	
		// %f para colocar pontos flutuantes (que por padrão passa seis casas decimais)
		// %.2f para colocar pontos flutuantes (com a formatação de duas casas decimais)
		// %10.f para marcar a quantidade de caracteres qua a variável vai ter, se ele tiver 3 caracteres, vai ser adicionado 7 espaços de padding
		double taxa = 19.5;
		System.out.printf("A taxa está em: %.2f%n", taxa);
	}
}
