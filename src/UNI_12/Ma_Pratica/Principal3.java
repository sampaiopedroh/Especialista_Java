package UNI_12.Ma_Pratica;

import UNI_12.Ma_Pratica.banco.Conta;
import UNI_12.Ma_Pratica.banco.Titular;

public class Principal3 {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.setTitular(new Titular("Pedro", "12345678910"));
        conta1.setAgencia(1234);
        conta1.setNumero(999999);
        conta1.setTipo(Conta.ESPECIAL);
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
