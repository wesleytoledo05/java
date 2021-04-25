package controle;

import java.util.Scanner;

public class If {
    public static Scanner entrada;

    public static void main(String[] args) {

        entrada = new Scanner(System.in);

        System.out.print("Informe a media do aluno: ");
        double media = entrada.nextDouble();

        if (media <= 10 && media >= 7.0) {
            System.out.println("Aprovado!!!");
            System.out.println("Parabéns!!!");
        }
        if (media > 4 && media <= 6.0) {
            System.out.println("Recuperação!");
        }
        if (media > 0 && media <= 4.0) {
            System.out.println("Reprovado!!!");
        }
        if (media == 0) {
            System.out.println("Burro!");
        }

    }

}
