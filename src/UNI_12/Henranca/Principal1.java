package UNI_12.Henranca;

import UNI_12.Henranca.banco.Conta;
import UNI_12.Henranca.banco.Titular;

public class Principal1 {
    public static void main(String[] args) {
        Titular titular = new Titular("Pedro", "12345678910");
        Conta conta1 = new Conta(titular, 1234,999999);

        conta1.imprimirDemonstrativo();

        conta1.depositar(100);
        conta1.imprimirDemonstrativo();

        conta1.sacar(27.5);
        conta1.imprimirDemonstrativo();
    }
}
