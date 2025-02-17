package UNI_7.Boxing;

public class Principal {
    public static void main(String[] args) {
        // Autoboxing
        Integer diasEntrega = Integer.valueOf(30);
        Integer diasParaEntrega = 30;

        // Unboxing
        int diasEntregaInt = diasEntrega.intValue();
        int diasParaEntregaInt = diasEntrega;
    }
}
