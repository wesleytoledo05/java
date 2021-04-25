package fundamentos;

public class NotacaoPonto {

    public static void main(String[] args) {

        String s = "Bom dia pessoal!";
        s = s.replace("pessoal", "seus lolzeiro");
        s = s.toUpperCase();
        s = s.concat("!!!");

        System.out.println(s);
    }
}
