package UNI_3;

public class CurtoCircuitoOperadoresLogicos {
	public static void main(String[] args) {
		// se um lado da expressão for validado, não será executado o outro lado
		int x = 10;
		int y = 20;

		// y não recebe o incremento, pois o primeiro lado da expressão já foi validado
		// Os dois precissam ser verdadeiros, mas o primeiro já é falso
		boolean resultado1 = x == 11 && y++ == 20;
		
		// Os apenas um precisa ser verdadeiro e o primeiro já é
		boolean resultado2 = x == 10 || y++ == 20;

		System.out.println(resultado1);
		System.out.println(resultado2);
		System.out.println(y);
	}
}
