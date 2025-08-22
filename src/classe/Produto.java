package classe;

public class Produto {

    String nome;
    double preco;
    double desconto;

    double precoComDesconto(double descontoDogerente) { // Não precisa passar parametros pois ja estão na classe
        return preco * ( 1 - (desconto + descontoDogerente) );
    }

}
