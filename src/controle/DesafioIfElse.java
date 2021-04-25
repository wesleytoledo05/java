package controle;

import java.util.Scanner;

public class DesafioIfElse {
    public static Scanner entrada;

    public static void main(String[] args) {

        entrada = new Scanner(System.in);

        System.out.print("Insira o dia da semana: ");
        String diaDaSemana = entrada.next();

        if (diaDaSemana.equalsIgnoreCase("domingo")) {
            System.out.println(diaDaSemana + " : Corresponde ao 1º dia da semana");
        } else if (diaDaSemana.equalsIgnoreCase("segunda")) {
            System.out.println(diaDaSemana + " : Corresponde ao 2º dia da semana");
        } else if (diaDaSemana.equalsIgnoreCase("terça")) {
            System.out.println(diaDaSemana + " : Corresponde ao 3º dia da semana");
        } else if (diaDaSemana.equalsIgnoreCase("quarta")) {
            System.out.println(diaDaSemana + " : Corresponde ao 4º dia da semana");
        } else if (diaDaSemana.equalsIgnoreCase("quinta")) {
            System.out.println(diaDaSemana + " : Corresponde ao 5º dia da semana");
        } else if (diaDaSemana.equalsIgnoreCase("sexta")) {
            System.out.println(diaDaSemana + " : Corresponde ao 6º dia da semana");
        } else if (diaDaSemana.equalsIgnoreCase("sábado")) {
            System.out.println(diaDaSemana + " : Corresponde ao 7º dia da semana");
        } else
            System.out.println("Insira um dia válido");

        entrada.close();
    }

}
