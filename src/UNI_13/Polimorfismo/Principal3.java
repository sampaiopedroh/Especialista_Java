package UNI_13.Polimorfismo;

import UNI_13.Polimorfismo.banco.*;

public class Principal3 {
    public static void main(String[] args) {
        CaixaEletronico caixaEletronico = new CaixaEletronico();

        Titular titular = new Titular("Pedro", "12345678910");

        ContaEspecial contaEspecial = new ContaEspecial(titular, 1234,999999, 90);
        contaEspecial.setLimiteChequeEspecial(1000);
        contaEspecial.credtitarRendimentos(10);

        ContaInvestimento contaInvestimento = new ContaInvestimento(titular, 1234,999999);
        contaInvestimento.depositar(10);
        contaInvestimento.credtitarRendimentos(15);

        ContaSalario contaSalario = new ContaSalario(titular, 1234,999999, 18_000);
        contaSalario.depositar(10);

        caixaEletronico.imprimirDemonstrativo(contaSalario);
    }
}
