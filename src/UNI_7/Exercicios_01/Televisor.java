package UNI_7.Exercicios_01;

public class Televisor {
    Integer canal = 130;
    Integer volume = 20;

    void mudarCanal(Integer novoCanal) {
        if (canal.equals(novoCanal)) {
            System.out.println("Novo canal é também o canal atual.");
        } else {
            canal = novoCanal.intValue();
            System.out.println("Canal alterado para " + canal);
        }
    }

    void mudarVolume(Integer novoVolume) {
        if (novoVolume == volume) {
            System.out.println("Novo volume é também o volume atual.");
        } else {
            volume = novoVolume.intValue();
            System.out.println("Volume alterado para " + volume);
        }
    }
}
