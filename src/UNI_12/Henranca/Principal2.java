package UNI_12.Henranca;

import UNI_12.Henranca.banco.ContaInvestimento;
import UNI_12.Henranca.banco.Titular;

public class Principal2 {
    public static void main(String[] args) {
        Titular titular = new Titular("Pedro", "12345678910");
        ContaInvestimento conta1 = new ContaInvestimento(titular, 1234,999999);

        conta1.imprimirDemonstrativo();

        conta1.depositar(100);
        conta1.imprimirDemonstrativo();

        conta1.credtitarRendimentos(6);
        conta1.imprimirDemonstrativo();
    }
}
