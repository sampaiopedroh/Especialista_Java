package UNI_8.BoasPraticasVarargs;

public class Principal {
    public static void main(String[] args) {
        var fatura = new Fatura();
        fatura.numero = 124;
        fatura.valorTotal = 2_300.50;


        var servicoDeCobranca = new ServicoDeCobranca();
//        String[] emailsCobranca = {"pedro@email.com", "maria@email.com"};
//        servicoDeCobranca.pagar(fatura, emailsCobranca);
//        servicoDeCobranca.pagar(fatura, new String[]{"pedro@email.com", "maria@email.com"});

//        pagar sem notificar
//        servicoDeCobranca.pagar(fatura, new String[0]);
//        servicoDeCobranca.pagar(fatura, new String[]{});

        // Varargs
        // servicoDeCobranca.pagar(fatura);
        // servicoDeCobranca.pagar(fatura, "pedro@email.com");

        // Boas Práticas
        servicoDeCobranca.pagar(fatura, "pedro@email.com");
    }
}
