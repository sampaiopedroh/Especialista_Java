package UNI_12.Duplicando;

import UNI_12.Duplicando.banco.ContaInvestimento;
import UNI_12.Duplicando.banco.Titular;

public class Principal2 {
    public static void main(String[] args) {
        ContaInvestimento conta1 = new ContaInvestimento();
        conta1.setTitular(new Titular("Pedro", "12345678910"));
        conta1.setAgencia(1234);
        conta1.setNumero(999999);

        conta1.imprimirDemonstrativo();

        conta1.depositar(100);
        conta1.imprimirDemonstrativo();

        conta1.credtitarRendimentos(6);
        conta1.imprimirDemonstrativo();
    }
}
