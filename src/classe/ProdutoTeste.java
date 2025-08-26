package classe;

public class ProdutoTeste {

    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook");
        p1.preco = 4568.89;

        var p2 = new Produto();
        p2.nome = "Celular";
        p2.preco = 2789.90;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinal1 = p1.precoComDesconto(0);
        double precoFinal2 = p1.precoComDesconto(0.3);

        System.out.printf("Valor do %s com desconto mas sem comemorativo: R$%.2f \n", p1.nome, precoFinal1);
        System.out.printf("Valor do %s com desconto e comemorativo: R$%.2f", p1.nome, precoFinal2);
    }
}
