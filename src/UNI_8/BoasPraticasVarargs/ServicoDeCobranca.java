package UNI_8.BoasPraticasVarargs;

import java.util.Objects;

public class ServicoDeCobranca {
    void pagar(Fatura fatura, String emailObrigatorio, String... emailsAdicionais) {
        Objects.requireNonNull(fatura, "Informe a fatura");
        Objects.requireNonNull(emailObrigatorio, "Informe pelo menos um e-mail");

        System.out.printf("Fatura %d, no valor total de R$%.2f, foi paga!%n",
                fatura.numero, fatura.valorTotal);

        enviarNotificacao(fatura, emailObrigatorio);

        for (String email : emailsAdicionais) {
            enviarNotificacao(fatura, email);
        }
    }

    private void enviarNotificacao(Fatura fatura, String email) {
        System.out.printf("Fatura %d enviada para %s%n", fatura.numero, email);
    }
}
