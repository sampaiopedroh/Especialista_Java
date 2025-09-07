package UNI_11.Principal_VI;

public class CalculadoraHorario {
    private Horario horario;

    private CalculadoraHorario(){};

    public static Horario somarDuasHoras(Horario horario) {
        int hora = horario.getHora() + 2;

        if (hora > 24) {
            hora -= 24;
        }

        return new Horario(hora, horario.getMinuto());
    }
}
