package fundamentos.operadores;

public class DesafioAritmeticos {

    public static void main(String[] args) {

        double numA = (6 * (3 + 2));
        numA = Math.pow(numA, 2);
        double denA = (3 * 2);
        double superiorA = numA / denA;

        double numB = (1 - 5) * (2 - 7);
        double denB = 2;
        double superiorB = numB / denB;
        superiorB = Math.pow(superiorB, 2);

        double superior = superiorA - superiorB;
        superior = Math.pow(superior, 3);

        double inferior = Math.pow(10, 3);

        double resultado = superior / inferior;

        System.out.println("O resultado vai ser = " + resultado);

    }

}
