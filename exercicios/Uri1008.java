import java.util.Scanner;

public class Uri1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int numFunc, qtdeHoras;
        double valorHora, salario;

        numFunc   = teclado.nextInt();
        qtdeHoras = teclado.nextInt();
        valorHora = teclado.nextDouble();

        salario   = valorHora * qtdeHoras;

        System.out.printf("NUMBER = %d\n", numFunc);
        System.out.printf("SALARY = U$ %.2f\n", salario);
    }
}