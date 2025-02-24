package UNI_9.RuntimeAPI;

public class Teste {
    public static void main(String[] args) {
        imprimirUsoMemoria();

        // No terminal
        // java -Xmx900M para limitar o máximo de memória da JVM em 900MB
        // java -Xms400M para limitar a quantidade de memória inicial da JVM

//        byte[] x = new byte[900 * 1024 * 1024];
//
//        System.out.println("-------------------");
//        imprimirUsoMemoria();
//
//        byte[] y = new byte[900 * 1024 * 1024];
//
//        System.out.println("-------------------");
//        imprimirUsoMemoria();
    }

    static void imprimirUsoMemoria() {
        System.out.printf("Máxima: %s%n", emMegabytes(Runtime.getRuntime().maxMemory()));

        System.out.printf("Total empenhada: %s%n", emMegabytes(Runtime.getRuntime().totalMemory()));

        System.out.printf("Quanto da empenhada está disponível: %s%n", emMegabytes(Runtime.getRuntime().freeMemory()));

        long memoriaUsada = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.printf("Quanto da empenhada está em uso: %s%n", emMegabytes(memoriaUsada));
    }

    static String emMegabytes(long bytes) {
        return String.format("%.2fMB", bytes / 1024d / 1024d);
    }
}
