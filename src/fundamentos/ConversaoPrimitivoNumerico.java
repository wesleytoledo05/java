package fundamentos;

public class ConversaoPrimitivoNumerico {

    public static void main(String[] args) {
        
        double a = 1;
        System.out.println(a); //Implicita

        float b = (float) 1.012345; //explicita (CAST)
        System.out.println(b);

        int c = 256;
        byte d = (byte) c; //explicita (CAST)
        
        double e = 1.99999;
        int f = (int) e; //explicita (CAST)
        
        System.out.println(Math.ceil(e + d + f));
    }
    
}
