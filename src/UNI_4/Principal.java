package UNI_4;

public class Principal {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.anoFabricacao = 1983;
        meuCarro.cor = "Preto";
        meuCarro.fabricante = "GM";
        meuCarro.modelo = "Opala";

        Carro seuCarro = new Carro();
        seuCarro.anoFabricacao = 2025;
        seuCarro.cor = "Cinza";
        seuCarro.fabricante = "BYD";
        seuCarro.modelo = "Dulphin";


        System.out.println("Meu Carro");
        System.out.println("----------");
        System.out.printf("Modelo: %s%n", meuCarro.modelo);
        System.out.printf("Ano: %s%n", meuCarro.anoFabricacao);

        System.out.println();

        System.out.println("Seu Carro");
        System.out.println("----------");
        System.out.printf("Modelo: %s%n", seuCarro.modelo);
        System.out.printf("Ano: %s%n", seuCarro.anoFabricacao);
    }
}
