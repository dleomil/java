import java.util.Scanner; // incluindo a biblioteca de leitura
public class Exercicio2c{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double base, altura, area;
        System.out.println("Digite a base");
        base = teclado.nextDouble();
        System.out.println("Digite a altura");
        altura = teclado.nextDouble();

        // processamento
        area = base * altura / 2;

        // saída
        System.out.printf("Area do triangulo = %.2f\n", area);
    }
}