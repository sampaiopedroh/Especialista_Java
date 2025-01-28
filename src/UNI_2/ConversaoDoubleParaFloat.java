package UNI_2;

public class ConversaoDoubleParaFloat {
	public static void main(String[] args) {
		// Para realizar casting de um tipo maior para um tipo menor, é necessário ter certeza que cabe e passar a instrução de casting
		double peso1 = 20.5;
		float peso2 = (float) peso1;
		System.out.println(peso1);
		System.out.println(peso2);
	
		// Já para tipos menores para maiores, não é necessário passar a instrução pois já é feito um casting automático
		float taxa1 = 19.9;
		double taxa2 = taxa1;
		System.out.println(taxa1);
		System.out.println(taxa2);
	}
}
