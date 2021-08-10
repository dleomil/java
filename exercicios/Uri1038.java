import java.util.Scanner;
public class Uri1038{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int codigo, qtde;
        double  preco, total;

        codigo = teclado.nextInt();
        qtde   = teclado.nextInt();
        preco  = 0.0;

        if (codigo == 1){
            preco = 4.00;
        }
        else if (codigo == 2){
            preco = 4.50;
        }
        else if (codigo == 3){
            preco = 5.00;
        }
        else if (codigo == 4){
            preco = 2.00;
        }
        else if (codigo == 5){
            preco = 1.50;
        }

        total = preco * qtde;
        System.out.printf("Total: R$ %.2f\n", total);
    }
}