package classe;

public class ProdutoTeste {

    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook");
        p1.preco = 4568.89;
        p1.desconto = 0.25;

        var p2 = new Produto();
        p2.nome = "Celular";
        p2.preco = 2789.90;
        p2.desconto = 0.09;

        System.out.println(p1.nome);
        System.out.println(p2.desconto);

        double precoFinal1 = p1.precoComDesconto(0.1);
        double precoFinal2 = p2.precoComDesconto(0.3);

        System.out.printf("Valor do %s com desconto: R$%.2f \n", p1.nome, precoFinal1);
        System.out.printf("Valor do %s com desconto: R$%.2f", p2.nome, precoFinal2);
    }
}
