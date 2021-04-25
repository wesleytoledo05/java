package fundamentos;

public class TiposPrimitivos {
    
    public static void main(String[] args) {
        
        //Tipos numéricos inteiros
        byte anosDeEmpresa = 23; //MAX. 127
        short numerosDeVoos = 542; //MAX. 32.767
        int id = 56789; //MAX. 2.147.483.647
        long pontosAcumulados = 3_123_845_223L; //MAX. 9.223.372.036.854.775.807

        //Tipos numéricos reais
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_992_800_102.01;


        //Tipo booleano
        boolean estaDeFerias = true; //false

        //Tipo caractere
        char status = 'A'; //ativo

        //Anos de empresa
        System.out.println(anosDeEmpresa * 365);

        //Numeros de voos
        System.out.println(numerosDeVoos / 2);

        //Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println("o ID: "+ id + " ganha = " +"R$"+ salario + " reais");

        System.out.println("Esta de Férias? " + estaDeFerias);

        System.out.println("Status = " + status);
    }
}
