package fundamentos;

public class Temperatura {
    public static void main(String[] args) {

        // (°F - 32) * 5/9 = °C

        final double ajuste = 32; // constante
        final double fator = 5 / 9.0; // constante
        int fahrenheit = 100; // variavel
        double ceusius = (fahrenheit - ajuste) * fator;

        System.out.println("o resultado é " + ceusius + " °C");

    }

}
