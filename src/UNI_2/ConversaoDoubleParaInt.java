package UNI_2;

public class ConversaoDoubleParaInt {
	public static void main(String[] args) {
		// De variáveis de tipos que permitem casas decimais para variáveis de tipos que não permitem casas decimais,
		// é necessário ter certza que cabe, ter noção de que vai perder o que estiver depois da vírgula
		// e passar a instrução de casting
		double largura = 100;
		int tamanho = (int) largura;

		// Já o contrário funciona normalmente (se couber)
		int x = 100;
		double y = x;
	}
}
