package UNI_10.StaticImport.sampaiopedroh.github.erp.matematica;

public class CalculadoraArea {
    public static final double PI = 3.14;

    public static double calcularAreaQuadrado(double medidaDoLado) {
        return medidaDoLado * medidaDoLado;
    }

    public static double calcularAreaCirculo(double raio) {
        return raio * raio * CalculadoraArea.PI;
    }
}
