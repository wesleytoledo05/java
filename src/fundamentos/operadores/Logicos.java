package fundamentos.operadores;

public class Logicos {
    
    public static void main(String[] args) {
        
        //Tabela verdade "E"
        System.out.println("Tabela verdade E(END)");
        System.out.println(true && true);
        System.out.println(true && false);
        // System.out.println(false && true);
        // System.out.println(false && false);

        System.out.println("\nTabela verdade OU(OR)");
        // System.out.println(true || true);
        // System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("\nTabela verdade OU exclusivo(XOR)");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        System.out.println("\nTabela verdade NOT");
        System.out.println(!true);
        System.out.println(!false);
        
    }
}
