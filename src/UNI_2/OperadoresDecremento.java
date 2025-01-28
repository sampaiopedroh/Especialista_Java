package UNI_2;

public class OperadoresDecremento {
	public static void main(String[] args) {
		int limiteTentativasLogin = 10;
		System.out.println("Limite de tentativas: " + limiteTentativasLogin);

		// Pós Fixado:
		int novoLimiteTentativasLogin = limiteTentativasLogin--;
		System.out.println("Novo limite de tentativas (pós fixado): " + novoLimiteTentativasLogin);
		System.out.println("Valor variável limiteTentativasLogin: " + limiteTentativasLogin);
		
		// Pré
		int maisNovoLimiteTentativasLogin = --limiteTentativasLogin;
		System.out.println("Novo limite de tentativas (pré fixado): " + maisNovoLimiteTentativasLogin);
		System.out.println("Valor variável limiteTentativasLogin: " + limiteTentativasLogin);
	}
}
