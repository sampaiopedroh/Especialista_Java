package UNI_5.Exercicios_01;

public class Principal {
    public static void main(String[] args) {
        Cachorro osmar = new Cachorro();
        osmar.cor = "Caramelo";
        osmar.raca = "Vira-Lata";
        osmar.porte = "Médio";
        osmar.idade = 9;

        Cachorro dug = new Cachorro();
        dug.cor = "Preto";
        dug.raca = "Pit Bull";
        dug.porte = "Grande";
        dug.idade = 7;

        System.out.println("Osmar");
        System.out.printf("Cor: %s%n", osmar.cor);
        System.out.printf("Raça: %s%n", osmar.raca);
        System.out.printf("Porte: %s%n", osmar.porte);
        System.out.printf("Idade: %s%n", osmar.idade);

        System.out.println("----------");

        System.out.println("Dug");
        System.out.printf("Cor: %s%n", dug.cor);
        System.out.printf("Raça: %s%n", dug.raca);
        System.out.printf("Porte: %s%n", dug.porte);
        System.out.printf("Idade: %s%n", dug.idade);
    }
}
