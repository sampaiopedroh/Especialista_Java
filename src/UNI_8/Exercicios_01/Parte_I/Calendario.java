package UNI_8.Exercicios_01.Parte_I;

public class Calendario {
    static String obterNomeMes(int numeroMes) {
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        for (int i = 0; i < meses.length; i++) {
            if (i == numeroMes) {
                return "O mês é: " + meses[i];
            }
        }
        return "Não encontramos esse mês";
    }

    public static void main(String[] args) {

        String mes = Calendario.obterNomeMes(9);
        System.out.println(mes);
    }
}
