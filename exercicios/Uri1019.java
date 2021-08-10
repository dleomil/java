import java.util.Scanner;

public class Uri1019{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int duracao;
        int hora, minu, segu, resto;

        // entrada
        duracao = teclado.nextInt();

        // processamento
        hora  = duracao / 3600;
        resto = duracao % 3600; // ou alternativamente  -> resto = duracao - hora * 3600

        minu  = resto / 60;
        segu  = resto % 60;     // ou alternativamente  -> segu   = resto - minu * 60;

        System.out.println(hora + ":" + minu + ":" + segu);
    }
}