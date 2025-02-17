package UNI_7.BoasPraticas;

public class Principal_II {
    public static void main(String[] args) {
        // Sempre valide se sua Wrapper não etá null
        Integer idade = null;

        // NullPointerException em todas as instrucões abaixo
        System.out.println(idade + 10);
        System.out.println(idade == 100);
        System.out.println(idade.equals(100));
    }
}
