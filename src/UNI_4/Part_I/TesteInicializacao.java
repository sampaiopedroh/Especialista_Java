package UNI_4.Part_I;

public class TesteInicializacao {
    public static void main(String[] args) {
//        Carro meuCarro = new Carro();
//
//        meuCarro.fabricante = "Honda";
//        meuCarro.anoFabricacao = 2021;
//        meuCarro.proprietario.nome = "Maria";
//
//        Pessoa proprietariAnterior = meuCarro.proprietario;
//
//        meuCarro.proprietario = new Pessoa();
//
//        System.out.println(meuCarro.fabricante);
//        System.out.println(meuCarro.modelo);
//        System.out.println(meuCarro.anoFabricacao);
//        System.out.println(meuCarro.proprietario.nome);


        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "João";

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Maria";

        Carro meuCarro = new Carro();
        meuCarro.modelo = "Opala";
        meuCarro.proprietario = pessoa1;

        Carro seuCarro = new Carro();
        seuCarro.modelo = "GT";
        seuCarro.proprietario = pessoa1;

//        meuCarro.proprietario.nome = "Sebastião";

        System.out.println(meuCarro.proprietario.nome);
        System.out.println(seuCarro.proprietario.nome);

//        meuCarro.proprietario.nome = "Maria";
//        System.out.println(pessoa1.nome);
    }
}

