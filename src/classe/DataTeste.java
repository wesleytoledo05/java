package classe;

public class DataTeste {
    public static void main(String[] args) {
        Data data = new Data();

        var data2 = new Data(29, 10, 2003);

        System.out.println(data.obterDataFormatada());
        System.out.println(data2.obterDataFormatada());


    }
    
}
