package UNI_11.FaltaDeEncapsulamento;

import UNI_11.FaltaDeEncapsulamento.servico.ServicoDepositoPix;
import UNI_11.FaltaDeEncapsulamento.servico.ServicoPagamentoOnline;

public class Principal {
    public static void main(String[] args) {
        var supermercado = new Estabelecimento("Supermercado do Zé");
        var cartao = new Cartao("Predu");

        var servicoDepositoPix = new ServicoDepositoPix();
        Recibo reciboDeposito = servicoDepositoPix.efetuarDepsito(cartao, 500);
        reciboDeposito.imprimir();

        var servicoPagamentoOnline = new ServicoPagamentoOnline();
        Recibo reciboPagamento = servicoPagamentoOnline.efetuarPagamento(supermercado, cartao, 50);
        reciboPagamento.imprimir();
    }
}
