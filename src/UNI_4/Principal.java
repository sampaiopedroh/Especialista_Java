package UNI_4;

public class Principal {
    public static void main(String[] args) {
        // Jeito instanciando Pessoa() antes
        Pessoa eu = new Pessoa();
        eu.nome = "Pedro";
        eu.anoNascimento = 2005;
        eu.cpf = "394.030.068-39";

        Carro meuCarro = new Carro();
        meuCarro.anoFabricacao = 1983;
        meuCarro.cor = "Preto";
        meuCarro.fabricante = "GM";
        meuCarro.modelo = "Opala";
        meuCarro.precoCompra = 10_000.0;
        meuCarro.proprietario = eu;

        // Jeito instanciando Pessoa() já no Carro()
        Carro seuCarro = new Carro();
        seuCarro.anoFabricacao = 2025;
        seuCarro.cor = "Cinza";
        seuCarro.fabricante = "BYD";
        seuCarro.modelo = "Dulphin";
        seuCarro.precoCompra = 170_000.0;
        seuCarro.proprietario = new Pessoa();
        seuCarro.proprietario.nome = "Andrade";
        seuCarro.proprietario.anoNascimento = 1983;
        seuCarro.proprietario.cpf = "315.337.888-64";

        meuCarro.imprimirResumoDepreciacao();
        System.out.println();
        seuCarro.imprimirResumoDepreciacao();

//        System.out.println("Meu Carro");
//        System.out.println("----------");
//        System.out.printf("Modelo: %s%n", meuCarro.modelo);
//        System.out.printf("Ano: %s%n", meuCarro.anoFabricacao);
//        System.out.printf("Proprietário: %s%n", meuCarro.proprietario.nome);
//
//        System.out.println();
//
//        System.out.println("Seu Carro");
//        System.out.println("----------");
//        System.out.printf("Modelo: %s%n", seuCarro.modelo);
//        System.out.printf("Ano: %s%n", seuCarro.anoFabricacao);
//        System.out.printf("Proprietário: %s%n", seuCarro.proprietario.nome);
    }
}
