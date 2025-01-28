package UNI_2;

public class ExemploString {
	public static void main(String[] args) {
		System.out.println("Fala, mergulhador");

		int x = 10;
		int y = 5;
		int z = x + y;
		// Aqui ele está concatenando a string "Resultado" + o valor da variável z
		System.out.println("Resultado: " + z);

		// Aqui ele está concatenando a string "Resultado" + o valor da variável x + o valor da variável y
		System.out.println("Resultado: " + x + y);

		// Já aqui, o compilador só começa a concatenar quando encotra uma string, até lá ele realiza expressões aritmetica
		System.out.println(x + y + "string");

	
		// Para realizar uma expressão aritmetica depois de uma string, faça isso:
		System.out.println("Resultado: " + (x + y));
	
		// String é algo nativo do java, mas não é um tipo primitivo, mas sim uma classe, por isso o "S" é maiúsculo
		String nome = "Pedro";
		int idade = 19;
		System.out.println(nome + " tem " + idade + " anos");
	}
}
