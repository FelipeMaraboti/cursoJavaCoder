package classe;

public class DataTeste {

    public static void main(String[] args) {
        Data nascimento = new Data();
        nascimento.dia = 25;
        nascimento.mes = 10;
        nascimento.ano = 2004;

        System.out.printf("Você nasceu no dia %d/%d/%d. \n", nascimento.dia, nascimento.mes, nascimento.ano);

        Data namoro = new Data();
        namoro.dia = 18;
        namoro.mes = 02;
        namoro.ano = 2024;

        System.out.printf("Você começou a namorar no dia %d/%d/%d. \n",  namoro.dia, namoro.mes, namoro.ano);
    }

}
