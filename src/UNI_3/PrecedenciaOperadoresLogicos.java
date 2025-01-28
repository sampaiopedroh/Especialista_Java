package UNI_3;

public class PrecedenciaOperadoresLogicos {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;

		boolean resultado = x == 13 && x == 15 || y == 20;
		// A JVM vê primeiro o && e depois o ||, qunado está sem os "()"
		// No caso seguinte ela resolve primeiro os "()"
		// boolean resultado = x == 13 && (x == 15 || y ==20);
		

		System.out.println(resultado);
	}
}
