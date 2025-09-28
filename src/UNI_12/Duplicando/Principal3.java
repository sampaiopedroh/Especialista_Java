package UNI_12.Duplicando;

import UNI_12.Duplicando.banco.ContaEspecial;
import UNI_12.Duplicando.banco.Titular;

public class Principal3 {
    public static void main(String[] args) {
        ContaEspecial conta1 = new ContaEspecial();
        conta1.setTitular(new Titular("Pedro", "12345678910"));
        conta1.setAgencia(1234);
        conta1.setNumero(999999);
        conta1.setLimiteChequeEspecial(1000);
        conta1.setTarifaMensal(90);

        conta1.imprimirDemonstrativo();

        conta1.depositar(100);
        conta1.imprimirDemonstrativo();

        conta1.sacar(200);
        conta1.imprimirDemonstrativo();

        conta1.debitarTarifaMensal();
        conta1.imprimirDemonstrativo();
    }
}
