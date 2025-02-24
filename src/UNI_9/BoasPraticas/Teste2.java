package UNI_9.BoasPraticas;

public class Teste2 {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        pilha.imprimirEstatisticas();

        pilha.adicionar(new Cliente());
        pilha.adicionar(new Cliente());
        pilha.adicionar(new Cliente());
        pilha.adicionar(new Cliente());
        pilha.adicionar(new Cliente());
        pilha.adicionar(new Cliente());
        pilha.adicionar(new Cliente());
        pilha.adicionar(new Cliente());
        pilha.adicionar(new Cliente());

        Cliente clienteRetirado = null;

        do {
            clienteRetirado = pilha.retirar();
            pilha.imprimirEstatisticas();
        } while (clienteRetirado != null);

    }
}
