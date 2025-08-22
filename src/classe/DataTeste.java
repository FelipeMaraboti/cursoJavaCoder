package classe;

public class DataTeste {

    public static void main(String[] args) {
        Data nascimento = new Data();
        nascimento.dia = 25;
        nascimento.mes = 10;
        nascimento.ano = 2004;


        Data namoro = new Data();
        namoro.dia = 18;
        namoro.mes = 2;
        namoro.ano = 2024;

        System.out.println("Você nasceu no dia " + nascimento.obterDataFormatada());
        System.out.println("Você começou a namorar no dia " + namoro.obterDataFormatada());
    }

}
