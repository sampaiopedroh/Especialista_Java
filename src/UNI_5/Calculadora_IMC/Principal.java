package UNI_5.Calculadora_IMC;

public class Principal {
    public static void main(String[] args) {
        CalculadoraImc calculadoraImc = new CalculadoraImc();
        Paciente pedro = new Paciente();

        pedro.altura = 1.7;
        pedro.peso = 75;

        IndiceMassaCorporal imc = calculadoraImc.calcular(pedro);

        if (imc.estaComObesidade()) {
            System.out.printf("Pacientecom alura de %.2f e peso de %.2f" +
                    "está com obesidade%n", imc.altura, imc.resultado);
        }

        System.out.printf("IMC: %.2f%n", imc.resultado);
    }
}
