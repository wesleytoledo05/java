package fundamentos;

public class AreaCirculo {
    public static void main(String[] args) {
        double raio = 3.4;
        final double pi = 3.14;
        double area = pi * raio * raio;
        System.out.println(area);

        raio = 10;
        area = pi * raio * raio;
        System.out.println("Area = " + area);

    }
    

}
