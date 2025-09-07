//package UNI_11.Principal_II;
//
//public class HorarioComLista {
//
//    private int[] valores = new int[2];
////    private int hora;
////    private int minuto;
//
//    public HorarioComLista(int hora, int minuto) {
//        setHora(hora);
//        setMinuto(minuto);
//    }
//
//    public int getHora() {
//        return valores[0];
//    }
//
//    public void setHora(int hora) {
//        if (hora < 0 || hora > 23) {
//            throw new IllegalArgumentException("Hora inválida: " + hora);
//        }
//        this.valores[0] = hora;
//    }
//
//    public int getMinuto() {
//        return valores[1];
//    }
//
//    public void setMinuto(int minuto) {
//        if (minuto < 0 || minuto > 59) {
//            throw new IllegalArgumentException("Minuto inválido: " + minuto);
//        }
//        this.valores[1] = minuto;
//    }
//
//    public void formatar() {
//        System.out.printf("%dh%dm", getHora(), getMinuto());
//    }
//}
//
