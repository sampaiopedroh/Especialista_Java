package UNI_6.Argumentos;

public class Principal {
    public static void main(String[] args) {
        Produto agua = new Produto();
        agua.nome = "Água";
        agua.precoUnitario = 5;
        agua.quantidade = 4;

        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();
        carrinhoDeCompra.adicionarItem(agua);

        Endereco endereco = new Endereco();
        endereco.logradouro = "Rua São Tome";
        endereco.numero = "314";
        endereco.bairro = "Logo lá";

        carrinhoDeCompra.gerarPedido(endereco);
    }
}
