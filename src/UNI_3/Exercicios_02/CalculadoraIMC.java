package UNI_3.Exercicios_02;

import java.util.Scanner;

public class CalculadoraIMC {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Você é homem ?");
		boolean homemOuMulher = entrada.nextBoolean();

		System.out.println("Qual o seu peso ?");
		double peso = entrada.nextDouble();

		System.out.println("Qual a sua altura ?");
		double altura = entrada.nextDouble();

		double imc = peso / (altura * altura);

		if (homemOuMulher) {
			if (imc < 20.7) {
				System.out.println("Você está abaixo do peso");
			} else if (imc < 26.4) {
				System.out.println("Você está no peso ideal");
			} else if (imc < 27.8) {
				System.out.println("Você está um pouco acima do peso");
			} else if (imc < 31.1) {
				System.out.println("Você está acima do peso");
			} else {
				System.out.println("Você está obeso");
			}
		} else {
			if (imc < 19.1) {
				System.out.println("Você está abaixo do peso");
			} else if (imc < 25.8) {
				System.out.println("Você está no peso ideal");
			} else if (imc < 27.3) {
				System.out.println("Você está um pouco acima do peso");
			} else if (imc < 32.3) {
				System.out.println("Você está acima do peso");
			} else {
				System.out.println("Você está obesa");
			}
		}
	}
}
