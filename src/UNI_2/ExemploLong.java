package UNI_2;

public class ExemploLong {
	public static void main(String[] args) {
		//  maior valor de um long é 9_223_372_036_854_775_807 e o menor é 9_223_372_036_854_775_807;
		
		// O java automaticamente considera o valor inserido (literal) como um tipo inteiro, no caso a seguir ele está atribuindo um int a um long, por isso não compila:
		// long populacaoUberlandia = 2_147_483_648;

		// Temos que mostrar ao compilador que o valor inserido (literal) é um long, assim ele interpretará como um long sendo atribuido a um long;
		long pupulacaoUberlandia = 2_147_483_648L;
		
		// Não compila:
		// System.out.println(2_147_483_648);
		
		// Compila:
		System.out.println(2_147_483_648L);
	}
}
