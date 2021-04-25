package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

    public static Scanner entrada;

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = entrada.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = entrada.nextDouble();

        System.out.print("Qual operação deseja realizar: ");
        String op = entrada.next();

        // Lógica
        double resultado = "+".equals(op) ? num1 + num2 : 0;
        resultado = "-".equals(op) ? num1 - num2 : resultado;
        resultado = "*".equals(op) ? num1 + num2 : resultado;
        resultado = "/".equals(op) ? num1 / num2 : resultado;
        resultado = "%".equals(op) ? num1 % num2 : resultado;


        System.out.printf("\n%.2f %s %.2f =  %.2f", num1, op, num2, resultado);
        entrada.close();

    }
}
