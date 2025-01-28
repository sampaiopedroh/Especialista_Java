package UNI_2;

public class ConversaoLongParaInt {
	public static void main(String[] args) {
		// Não é possível atribuir um valor atribuido a uma variável de um tipo a uma outra variável de outro tipo, como no exemplo:
		// long x = 10;
		// int y = x;
		
		// Quando você garante que a conversão de um para o outro é possível, você pode usar o casting
		long x = 10;
		int y = (int) x;
		System.out.println(x);
		System.out.println(y);

		// Se não tiver certeza mas ainda sim realizar o casting, vai perder o valor original
		long a = 999999999999999L;
		int b = (int) a;
		System.out.println(a);
		System.out.println(b);

	}
}
