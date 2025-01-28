package UNI_2;

public class SequenciasEscape {
	public static void main(String[] args) {
		// Não funciona:
		// System.out.println("Oi "Maria"");
		
		// Usando o sequência de escape para colocar "" no meio de um print
		System.out.println("Oi \"Maria\"");
		
		// Também pode ser usado para quebrar linha:
		System.out.println("\nMeu nome é:\nPedro");

		// E para mostar a contra barra, faça isso:
		System.out.println("\nC:\\Windows");
	}
}
