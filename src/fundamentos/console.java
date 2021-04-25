package fundamentos;

import java.util.Scanner;

public class console {

     public static Scanner entrada;

    public static void main(String[] args) {
        
      entrada = new Scanner(System.in);

      System.out.print("Qual seu nome: ");
      String nome = entrada.nextLine();

      System.out.print("Qual seu sobrenome: ");
      String sobrenome = entrada.nextLine();

      System.out.print("Digite a sua idade: ");
      int idade = entrada.nextInt();

      System.out.printf("O aluno %s %s tem %d anos.%n", nome, sobrenome, idade);

      entrada.close();
    }
}
