package classe;

public class ValorVsReferencia {

    public static void main(String[] args) {

        double a = 2;
        double b = a;

        a++;
        b--;

        System.out.println(a + " " + b);

        Data d1 = new Data(1, 6, 2022);
        Data d2 = d1;

        d1.dia = 21;
        d2.mes = 12;

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        
       VoltarValorPadrao(d1); 

       System.out.println(d1.obterDataFormatada());
       System.out.println(d2.obterDataFormatada());
        
    }

    static void VoltarValorPadrao(Data d){
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }
    
}
