package classe;

public class Produto {

    String nome;
    double preco;
    static double desconto = 0.25;

    Produto() {

    }

    Produto(String nomeInicial) {
     nome = nomeInicial;
    }

    double precoComDesconto(double descontoComemorativo) { // Não precisa passar parametros pois ja estão na classe
        return preco * ( 1 - (desconto + descontoComemorativo));
    }

}
