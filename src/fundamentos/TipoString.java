package fundamentos;

public class TipoString {
    
    public static void main(String[] args) {
        System.out.println("Olá Pessoal!".charAt(2));

        String s = "Boa tarde";

        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.endsWith("tarde"));
        System.out.println(s.length());
        System.out.println(s.toLowerCase().equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("bao tarde"));
        
        var nome = "Wesley ";
        var sobrenome = "Toledo";
        var idade = 18;
        var salario = " merda nenhuma";

        System.out.println(nome + sobrenome);
        System.out.println("Ele tem: " +  idade + " anos" + " e " + salario + " '-'");

        System.out.printf("O aluno %s %s tem %d anos e ganha R$%s  ", nome, sobrenome, idade, salario );

        String frase = String.format("\nO aluno %s %s tem %d anos e ganha R$%s  ", nome, sobrenome, idade, salario);

        System.out.println(frase);
    }

}
