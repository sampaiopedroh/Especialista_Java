package UNI_4.Portaria;

public class Principal {
    public static void main(String[] args) {
        Visitante visitante = new Visitante();
        visitante.nome = "Pedro";
        visitante.idade = 19;

        CadastroPortaria cadastroPortaria = new CadastroPortaria();
        cadastroPortaria.cadastrar(visitante, 2);
        cadastroPortaria.cadastrar(visitante);
    }
}
