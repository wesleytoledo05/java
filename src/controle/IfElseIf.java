package controle;

import java.util.Scanner;

public class IfElseIf {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira a nota do aluno: ");

        double nota = entrada.nextDouble();

        if (nota <0 || nota >10){
            System.out.println("Nota inválida!");
        }else if(nota == 10){
            System.out.println("A+ - Você é incrivel");
        }else if( nota >=8){
            System.out.println("A - Parabéns!");
        }else if(nota >=6){
            System.out.println("B - Boaa!");
        }else if( nota >= 4){
            System.out.println("C - Podia ter sido melhor!");
        }else if(nota >= 1){
            System.out.println("D - Tu é uma anta jovem?");
        }else if(nota == 0){
            System.out.println("F - Da mais não, desisto dessa merda.");
        }


        entrada.close();
    }
    
}
