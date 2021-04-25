package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

    private static Scanner entrada;

    public static void main(String[] args) {
        
        entrada = new Scanner(System.in);

        System.out.print("Seu penultimo salário: ");
        String penultimo = entrada.next().replace(",", ".");
        
        System.out.print("Seu ultimo salário: ");
        String ultimo= entrada.next().replace(",", ".");
        
        
        System.out.print("Salário atual: ");
        String atual = entrada.next().replace(",", ".");

        double salario1 = Double.parseDouble(penultimo);
        double salario2 = Double.parseDouble(ultimo);
        double salario3 = Double.parseDouble(atual);

        Double media = (salario1 + salario2 + salario3) / 3;

        System.out.println("A média entre seus ultimos salarios é: " + "R$" + media + "Reais");


        
    }
    
}
