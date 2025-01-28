package UNI_2;

public class ExemploBoolean {
	public static void main(String[] args) {
		boolean compraAprovada = true;
		boolean clienteBloqueado = false;

		System.out.println("Compra aprovada: " + compraAprovada);
		System.out.println("Cliente bloqueado: " + clienteBloqueado);

		int quantidadeEstoque = 10;
		int quantidadePedidoCompra = 15;
		boolean estoqueSuficiente = quantidadeEstoque >= quantidadePedidoCompra;
		System.out.println("Estoque suficiente: " + estoqueSuficiente);
	}
}
