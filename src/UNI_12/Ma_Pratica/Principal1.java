package UNI_12.Ma_Pratica;

import UNI_12.Ma_Pratica.banco.Conta;
import UNI_12.Ma_Pratica.banco.Titular;

public class Principal1 {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.setTitular(new Titular("Pedro", "12345678910"));
        conta1.setAgencia(1234);
        conta1.setNumero(999999);
        conta1.setTipo(Conta.NORMAL);

        conta1.imprimirDemonstrativo();

        conta1.depositar(100);
        conta1.imprimirDemonstrativo();

        conta1.sacar(27.5);
        conta1.imprimirDemonstrativo();

//        conta1.credtitarRendimentos(6);
    }
}
