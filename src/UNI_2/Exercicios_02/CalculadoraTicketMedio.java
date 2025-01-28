package UNI_2.Exercicios_02;

public class CalculadoraTicketMedio {
	public static void main(String[] args) {
		int ticket1 = 20;
		int ticket2 = 30;
		int ticket3 = 100;

		int mediaTresUltimasVendas = (ticket1 + ticket2 + ticket3) / 3;
		System.out.println("A média das útimas três vendas é: " + mediaTresUltimasVendas);
	}
}
