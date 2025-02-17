package UNI_7.Wrapper;

public class Principal_II {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.idade = Integer.valueOf(20);

        System.out.printf("Idade: %d%n", cliente.idade);
    }
}
