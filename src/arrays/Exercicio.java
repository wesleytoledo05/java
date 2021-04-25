package arrays;

import java.util.Arrays;


public class Exercicio {

    public static void main(String[] args) {

        double[] notasAlunoA = new double[4];
        notasAlunoA[0] = 8.9;
        notasAlunoA[1] = 1.9;
        notasAlunoA[2] = 6.9;
        notasAlunoA[3] = 7.5;
        System.out.println(Arrays.toString(notasAlunoA));

        double total = 0;
        for (int i = 0; i < notasAlunoA.length; i++) {
            total += notasAlunoA[i];
        }
        System.out.println(total / notasAlunoA.length);



        double[] notasAlunoB = { 6.5, 8.9, 5.5, 10 };
        double totalAlunoB = 0;
        for (int i = 0; i < notasAlunoB.length; i++) {
            totalAlunoB += notasAlunoB[i];
        }
        System.out.println(totalAlunoB /  notasAlunoB.length);
        System.out.println(notasAlunoB[notasAlunoB.length - 2]);
    }
}
