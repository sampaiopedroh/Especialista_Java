package UNI_13.Polimorfismo;

import UNI_13.Polimorfismo.banco.*;

public class Principal2 {
    public static void main(String[] args) {
        CaixaEletronico caixaEletronico = new CaixaEletronico();

        Titular titular = new Titular("Pedro", "12345678910");
        Titular titular2 = new Titular("Maria", "10987654321");
        Titular titular3 = new Titular("José", "13245768109");

        ContaEspecial contaEspecial1 = new ContaEspecial(titular, 1234,999999, 90);
        ContaEspecial contaEspecia2 = new ContaEspecial(titular2, 4321, 888888, 100);

        contaEspecial1.depositar(300);

        caixaEletronico.transferir(contaEspecial1, contaEspecia2, 50);
        contaEspecial1.imprimirDemonstrativo();
        contaEspecia2.imprimirDemonstrativo();

        ContaSalario contaSalario = new ContaSalario(titular3, 2314, 777777, 18_000);

        caixaEletronico.transferir(contaEspecial1, contaSalario, 50);
        contaEspecial1.imprimirDemonstrativo();
        contaSalario.imprimirDemonstrativo();
    }
}
