package UNI_13.Polimorfismo.banco;

public class CaixaEletronico {
    public static final double TARIFA_TRANSFERENCIA = 10;
    public static final double TARIFA_IMPRESSAO_DEMONSTRATIVO = 5;

    public void transferir(Conta contaOrigem, Conta contaDestino, double valorTransferencia) {
        System.out.printf("Transferindo R$%.2f da conta %d/%d para %d%d%n",
                valorTransferencia, contaOrigem.getAgencia(), contaOrigem.getNumero(), contaDestino.getAgencia(), contaOrigem.getNumero());

        contaOrigem.sacar(valorTransferencia + TARIFA_TRANSFERENCIA);
        contaDestino.depositar(valorTransferencia);
    }

//    public void imprimirDemonstrativo(Conta conta) {
//        if (conta instanceof ContaInvestimento contaInvestimento && contaInvestimento.getValorTotalRendimentos() > 0) {
//        // if (conta instanceof ContaInvestimento && contaInvestimento.getValorTotalRendimentos() > 0)
//            // ContaInvestimento contaInvestimento = (ContaInvestimento) conta;
//            System.out.println("Impressão do demonstrativo é gratuita");
//        } else {
//            debitarTarifaImpressaoDemonstrativo(conta);
//        }
//
//        conta.imprimirDemonstrativo();
//    }

    // 1˚ solução para evitar instaceof
//    public void imprimirDemonstrativo(Conta conta) {
//        debitarTarifaImpressaoDemonstrativo(conta);
//        conta.imprimirDemonstrativo();
//    }
//
//    public void imprimirDemonstrativo(ContaInvestimento contaInvestimento) {
//        if (contaInvestimento.getValorTotalRendimentos() > 0) {
//            System.out.println("Impressão do demonstrativo é gratuita");
//        } else {
//            debitarTarifaImpressaoDemonstrativo(contaInvestimento);
//        }
//
//        contaInvestimento.imprimirDemonstrativo();
//    }

    // 2˚ solução
    public void imprimirDemonstrativo(Conta conta) {
        if (conta.possuiGratuidadeImpressao()) {
            System.out.println("Impressão do demonstrativo é gratuita");
        } else {
            debitarTarifaImpressaoDemonstrativo(conta);
        }

        conta.imprimirDemonstrativo();
    }

    private static void debitarTarifaImpressaoDemonstrativo(Conta conta) {
        System.out.printf("Custo da impressão: R$%.2f%n", TARIFA_IMPRESSAO_DEMONSTRATIVO);
        conta.sacar(TARIFA_IMPRESSAO_DEMONSTRATIVO);
    }
}
