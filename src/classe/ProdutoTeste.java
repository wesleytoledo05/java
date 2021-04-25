package classe;

public class ProdutoTeste {
    public static void main(String[] args) {
        
        Produto p1 = new Produto("Pc-Gamer", 5000.00);
        
        var p2 = new Produto();
        p2.nome = "Cadeira-Gamer";
        p2.preco = 2000.00;

        Produto.desconto = 0.50;


        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto();
        double mediaDoCarrinho = (precoFinal1 + precoFinal2) / 2;

        System.out.println(p1.nome + " = " + p1.precoComDesconto());
        System.out.println(p2.nome + " = " + p2.precoComDesconto());
        System.out.println("A média do carrinho é " + "R$" + mediaDoCarrinho);

    
    }
    
}
