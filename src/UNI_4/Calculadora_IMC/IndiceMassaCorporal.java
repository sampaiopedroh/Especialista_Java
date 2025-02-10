package UNI_4.Calculadora_IMC;

public class IndiceMassaCorporal {
    double resultado;
    double peso;
    double altura;

    boolean estaComObesidade() {
        return resultado >= 30;
    }

    boolean estaAbaixoPesoIdeal() {
        return resultado < 18.5;
    }

}
