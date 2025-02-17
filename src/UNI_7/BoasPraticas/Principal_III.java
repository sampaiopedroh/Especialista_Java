package UNI_7.BoasPraticas;

public class Principal_III {
    public static void main(String[] args) {
        // Muitos unboxing alteram o tempo de execução do programa
        long tempoInicio = System.currentTimeMillis();

        Long soma = 0L; // -> mais de 6s
        // long soma = 0L; -> menos de 1s
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            soma +=  i;
        }

        System.out.println(soma);

        double duracao = (System.currentTimeMillis() - tempoInicio) / 1000d;
        System.out.printf("Duração: %.2f%n", duracao);
    }
}
