package UNI_8.Varargs;

public class ServicoDeCobranca {
    // Sem varargs
    // void pagar(Fatura fatura, String[] emailsCobranca) {

    // Com Varargs
    void pagar(Fatura fatura, String... emailsCobranca) {
        System.out.printf("Fatura %d, no valor total de R$%.2f, foi paga!%n",
                fatura.numero, fatura.valorTotal);

        for (String email : emailsCobranca) {
            System.out.printf("Fatura %d enviada para %s%n", fatura.numero, email);
        }
    }
}
