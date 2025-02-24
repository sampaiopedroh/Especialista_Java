package UNI_9.GarbageCollector;

public class Teste {
    public static void main(String[] args) {
        imprimirUsoMemoria();

        byte[] x = new byte[900 * 1024 * 1024];
        x = null;

        System.out.println("-------------------");
        imprimirUsoMemoria();

        byte[] y = new byte[10 * 1024 * 1024];

        System.out.println("-------------------");
        imprimirUsoMemoria();

        // Chama o Garbage Collector
        System.gc();
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

