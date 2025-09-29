package UNI_13.Polimorfismo;

import UNI_13.Polimorfismo.banco.Conta;
import UNI_13.Polimorfismo.banco.ContaEspecial;
import UNI_13.Polimorfismo.banco.Titular;

public class Principal1 {
    public static void main(String[] args) {
        Titular titular = new Titular("Pedro", "12345678910");
        ContaEspecial contaEspecial = new ContaEspecial(titular, 1234,999999, 90);
        contaEspecial.setLimiteChequeEspecial(1000);
        contaEspecial.depositar(100);

        Conta conta = (Conta) contaEspecial;
//        ou
//        Conta conta = contaEspecial;

        System.out.println(contaEspecial.getClass().getName());
        System.out.println(conta.getClass().getName());
        System.out.println(contaEspecial.equals(conta));
    }
}
