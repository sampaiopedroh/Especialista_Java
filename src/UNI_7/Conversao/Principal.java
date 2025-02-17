package UNI_7.Conversao;

public class Principal {
    public static void main(String[] args) {
        int idade = 20;
        short idadeShort = (short) idade;

        Integer diasEntrega = Integer.valueOf(30);
        short diasEntregaShort = diasEntrega.shortValue();
        // Ou
        // Short diasEntregaShort = Short.valueOf(diasEntrega.shortValue());

        Long diasEntregaLong = Long.valueOf(diasEntrega.longValue());

        Double valorTotal = Double.valueOf(1_500.2);
    }
}
