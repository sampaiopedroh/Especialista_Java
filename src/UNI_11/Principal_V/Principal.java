package UNI_11.Principal_V;

public class Principal {
    public static void main(String[] args) {
        Horario horario = new Horario(10, 30);
        Agendamento agendamentoCabelo = new Agendamento(horario, "Corte de cabelo");

        horario.setHora(11);
        horario.setMinuto(45);
        Agendamento agendamentoBarba = new Agendamento(horario, "Feitio de barba");

        imprimir(agendamentoCabelo);
        imprimir(agendamentoBarba);
    }

    private static void imprimir(Agendamento agendamento) {
        System.out.printf("%s às %s%n", agendamento.getDescricao(), agendamento.getHorario());
    }
}
