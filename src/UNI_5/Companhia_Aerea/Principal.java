package UNI_5.Companhia_Aerea;

public class Principal {
    public static void main(String[] args) {
        var aviaoGol = new Aeronave();
        aviaoGol.totalAcessos = 100;

        aviaoGol.ativar();
        // aviaoGol.desativar();

        aviaoGol.reservarAssentos(10);

        System.out.printf("GOL (%S): %d assentos disponíveis%n", aviaoGol.ativo ? "Ativo" : "Inativo", aviaoGol.calcularAssentosDisponiveis());

        var aviaoLatam = new Aeronave();
        aviaoLatam.totalAcessos = 80;

        aviaoLatam.reservarAssentos(15);

        System.out.printf("LATAM (%S): %d assentos disponíveis%n", aviaoGol.ativo ? "Ativo" : "Inativo", aviaoGol.calcularAssentosDisponiveis());
    }
}
