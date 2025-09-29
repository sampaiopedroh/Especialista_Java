package UNI_13.Classes_Abstratas;

import UNI_13.Classes_Abstratas.fiscal.GestorFiscal;
import UNI_13.Classes_Abstratas.fiscal.NotaFicalProduto;
import UNI_13.Classes_Abstratas.fiscal.NotaFiscalServico;

public class Principal {
    public static void main(String[] args) {
        var gestorFiscal = new GestorFiscal();
        var nfBolaFutebol = new NotaFicalProduto("Bola de Futebol", 300, 50);
        var nfReparoMotor = new NotaFiscalServico("Reparo do motor", 1100, true);

//        System.out.println(nfBolaFutebol.calcularImpostos());
//        System.out.println(nfReparoMotor.calcularImpostos());

        gestorFiscal.emitirNotasFiscais(nfBolaFutebol, nfReparoMotor);
    }
}
