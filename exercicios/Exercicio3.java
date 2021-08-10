import java.util.Scanner;
public class Exercicio3{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double salarioMinimo, qtdKw, valorKw, valorTotal, valorDesc;

        System.out.println("Digite o valor do salario Minimo");
        salarioMinimo = teclado.nextDouble();
        System.out.println("Digite a quantidade de kw consumidas");
        qtdKw = teclado.nextDouble();

        // processamento
        valorKw = salarioMinimo/ 700;
        valorTotal = valorKw * qtdKw;
        valorDesc = valorTotal * 0.9;

        System.out.printf("Valor de 1 Kw R$ %.2f\n", valorKw);
        System.out.printf("Valor total da conta R$ %.2f\n", valorTotal);
        System.out.printf("Valor com desconto de 10%% R$ %.2f\n", valorDesc);
    }
}