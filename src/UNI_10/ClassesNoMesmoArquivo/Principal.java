package UNI_10.ClassesNoMesmoArquivo;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Pedro";
        pessoa.idade = 19;
    }
}

class Pessoa {
    int idade;
    String nome;
}
