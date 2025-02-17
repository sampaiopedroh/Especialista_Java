package UNI_6.Argumentos;

import java.util.Objects;

public class CarrinhoDeCompra {
   void adicionarItem(Produto produto) {
      // Use exceptions para validar argumentos, onde podemos encerrar o programa quando um erro for encontrado
      Objects.requireNonNull(produto, "Produto deve ser informado");

      if (produto.quantidade <= 0) {
         throw new IllegalArgumentException("Quantidade deve ser maior que 0");
      }
   }

   void gerarPedido(Endereco endereco) {
      Objects.requireNonNull(endereco, "Endereço deve ser informado");

      this.criarNovoPedido(endereco);
   }

   void gerarPedido(){
      this.criarNovoPedido(null);
   }

   // nunca passe null como argumento para métodos públicos, apenas para privados (mas também evite)
   private void criarNovoPedido(Endereco endereco) {
      //
   }
}
