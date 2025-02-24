package UNI_9.MemoriaJVM;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Olá, " + nome);

        // use o terminal com o NativeMemoryTracking (pega id), jcmd [id] [comandos] e top -pid [id]
    }
}
