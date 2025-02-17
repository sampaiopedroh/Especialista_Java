package UNI_6.Argumentos;

public class Produto {
    String nome;
    int precoUnitario;
    int quantidade;
    boolean ativo;

    void ativar() {
        System.out.printf("Ativando");
        this.ativo = true;
    }

    void desativar() {
        System.out.printf("Desativando");
        this.ativo = false;
    }
}
