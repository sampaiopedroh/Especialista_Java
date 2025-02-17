package UNI_7.Boxing;

public class Principal_I {
    public static void main(String[] args) {
        Integer numero1 = 128;
        Integer numero2 = 128;

        // Errado
        System.out.println(numero1 == numero2);

        // Certo
        System.out.println(numero1.equals(numero2));

        // Certo
        // negativo: segundo maior que primeiro
        // positivo: primeiro maior que segundo
        // 0: iguais
        System.out.println(numero1.compareTo(numero2) == 0);
    }
}
