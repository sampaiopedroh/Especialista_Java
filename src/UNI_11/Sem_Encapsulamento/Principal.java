package UNI_11.Sem_Encapsulamento;

import UNI_11.Sem_Encapsulamento.servico.DepositoPixServico;
import UNI_11.Sem_Encapsulamento.servico.PagamentoOnlineServico;

public class Principal {
    public static void main(String[] args) {
        var supermercado = new Estabelecimento("Supermercado do Zé");
        var cartao = new Cartao("Pedro");

        var servicoDeposito = new DepositoPixServico();
        Recibo reciboDeposito = servicoDeposito.efeturaDeposito(cartao, 500);
        reciboDeposito.imprimir();

        System.out.printf("Titular: %s%n", cartao.titular);
        System.out.printf("Saldo: R$%.2f%n", cartao.saldo);

        var servicoPagamento = new PagamentoOnlineServico();
        Recibo reciboPagamento = servicoPagamento.efetuarPagamento(supermercado, cartao, 100);
        reciboPagamento.imprimir();

        System.out.printf("Titular: %s%n", cartao.titular);
        System.out.printf("Saldo: R$%.2f%n", cartao.saldo);
    }
}
