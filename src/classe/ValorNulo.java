package classe;

public class ValorNulo {

    public static void main(String[] args) {
        
        String x = "";
        System.out.println(x.concat("!!!"));

        Data d1 = Math.random() > 0.5  ? new Data() : null;

        if(d1 != null){
            d1.mes = 3;
            System.out.println(d1.obterDataFormatada());
        }
        String s2 = Math.random() > 0.5 ? "Opa" : null;

        if(s2 != null){
            System.out.println(s2.concat("?????"));
        }
    }
    
}
