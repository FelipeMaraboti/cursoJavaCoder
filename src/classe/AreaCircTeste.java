package classe;

public class AreaCircTeste {

    public static void main(String[] args) {
        AreaCirc a1 = new AreaCirc(10);
        System.out.println("Area: " + a1.area());

        // a1.PI = 2; Maneira incorreta de mexer com variavel de classe
        // AreaCirc.PI = 3.1415; Maneira correta de mexer com variavel de classe

        AreaCirc a2 = new AreaCirc(10);
        System.out.println("Area: " + a2.area());

        System.out.println(AreaCirc.PI);
        System.out.println(Math.PI);
    }

}
