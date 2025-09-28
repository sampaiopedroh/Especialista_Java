package UNI_12.Henranca;

import UNI_12.Henranca.banco.Conta;
import UNI_12.Henranca.banco.ContaEspecial;
import UNI_12.Henranca.banco.Titular;

public class Principal6 {
    public static void main(String[] args) {
        Titular titular = new Titular("Pedro", "12345678910");
        var conta1 = new Conta(titular, 1234,999999);
        var conta2 = new Conta(titular, 1234,999999);

        System.out.println(conta1.equals(conta2));
    }
}
