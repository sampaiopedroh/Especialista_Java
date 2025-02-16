package UNI_4.Companhia_Aerea;

public class Aeronave {
    boolean ativo = true;
    int totalAcessos;
    int assentosReservados;

    int calcularAssentosDisponiveis() {
        return totalAcessos - assentosReservados;
    }

    void reservarAssentos(int numeroAssentos) {
        if (ativo) {
            assentosReservados += numeroAssentos;
        }
        else {
            System.out.println("Aeronave desativada. Assentos não reservados.");
        }
    }

    void desativar() {
        ativo = false;
    }

    void ativar() {
        ativo = true;
    }

}
