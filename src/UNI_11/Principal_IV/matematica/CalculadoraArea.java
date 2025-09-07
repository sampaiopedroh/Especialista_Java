package UNI_11.Principal_IV.matematica;

public class CalculadoraArea {
    public static final double PI = 3.1415;

    private CalculadoraArea(){}

    public static double calcularAreaQuadrado(double medidaDoLado) {
        return medidaDoLado * medidaDoLado;
    }

    public static double calcularAreaCirculo(double raio) {
        return raio * raio * CalculadoraArea.PI;
    }
}
