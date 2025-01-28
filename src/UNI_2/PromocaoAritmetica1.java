package UNI_2;

public class PromocaoAritmetica1 {
	public static void main(String[] args){
		// Isso não funciona pois o valor resultado da multiplicação das variáveis de tipo long, é um tipo long
		// e não é convertido para int automaticamente
		// long x = 10;
		// long y = 5;
		// int z = x * y;

		// O correto é atribuir a uma variável do mesmo tipo
		long x = 10;
		long y = 5;
		long z = x * y;

		System.out.println(z);
	}
}
