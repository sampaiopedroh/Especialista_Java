package UNI_5.Exercicios_04;

public class NumeroUtil {
    static void descobreMaiorNumero(final int numero1, final int numero2) {
        if (numero2 > numero1) {
            System.out.printf("O maior número é o: ", numero2);
        }
        System.out.printf("O maior número é o: ", numero1);
    }

    static void descobreMaiorNumero(final int numero1, final int numero2, final int numero3) {
        if (numero2 > numero1 && numero2 > numero3) {
            System.out.printf("O maior número é o: ", numero2);
        }
        else if (numero3 > numero1) {
            System.out.printf("O maior número é o: ", numero3);
        }
        System.out.printf("O maior número é o: ", numero1);
    }

    static void descobreMaiorNumero(final double numero1, final double numero2) {
        if (numero2 > numero1) {
            System.out.printf("O maior número é o: ", numero2);
        }
        System.out.printf("O maior número é o: ", numero1);
    }

    static void descobreMaiorNumero(final double numero1, final double numero2, final double numero3) {
        if (numero2 > numero1 && numero2 > numero3) {
            System.out.printf("O maior número é o: ", numero2);
        }
        else if (numero3 > numero1) {
            System.out.printf("O maior número é o: ", numero3);
        }
        System.out.printf("O maior número é o: ", numero1);
    }
}
