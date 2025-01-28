package UNI_2;

public class ExemploFloatDouble {
	public static void main(String[] args) {
		// float tem 32 bits de capacidade e uma precisão de 6 casas decimais
		// double tem 64 bits de capacidade e uma precisão de 15 casas decimais
		
		// Pode deixar explicito que é um double colocando um "D" no final do número
		double peso = 80.5; // "D" é opcional
		System.out.println("Meu peso: " + peso);

		// O valor literal que se coloca de um número decimal automaticamente é um double, por isso é necessário colocar o F no fim do número
		// Não compila:
		// float taxa = 1_294.93;
		
		// Compila:
		float taxa = 1_294.93F;
		System.out.println(taxa);

		// double e float não devem ser usados quando há uma necessidade de precisão, como sistemas de compras
		// Para esses casos não será usado um tipo primitivo, mas uma classe chamada BigDecimal, que é mais seguro
	}
}
