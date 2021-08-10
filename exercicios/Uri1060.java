import java.util.Scanner;

public class Uri1060{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double numero;
        int qtdePositivos = 0;

        for (int cont=1; cont <= 6; cont++){
            numero = teclado.nextDouble();
            if (numero > 0){   //numero % 2== 0
                qtdePositivos = qtdePositivos + 1; // qtdePares++;
            }
        }

        System.out.println(qtdePositivos + " valores positivos");
    }
}