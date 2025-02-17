package UNI_7.ComparandoWrappers;

public class Principal {
    public static void main(String[] args) {
        // De -128 a 127, já existem objetos com esses valores, por isso na comparação funciona
        // Já que estão referenciando o mesmo objeto, mesmo endereço de memória
        Integer numero1 = 127;
        Integer numero2 = 127;

        // Aqui são instanciados 2 objetos diferentes, diferentes endereços de memória, por isso retorna false
        Integer numero3 = 128;
        Integer numero4 = 128;

        System.out.println(numero1 == numero2);
        System.out.println(numero3 == numero4);

        // Para fazer a comparação entre mesmo tipo, use:
        System.out.println(numero3.equals(numero4));

        // Para tipos diferentes, converta os dois para o mesmo tipo primitivo
        Short numero5 = 128;
        System.out.println(numero4.intValue() == numero3.intValue());
    }
}
