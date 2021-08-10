import java.util.Scanner;
public class Exercicio5{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double distancia, velocidade, tempo, consumo;

        System.out.println("Digite a velocidade media");
        velocidade = teclado.nextDouble();
        System.out.println("Digite o tempo em horas de viagem");
        tempo = teclado.nextDouble();

        // processamento
        distancia = velocidade * tempo;
        consumo   = distancia / 12.0;

        // saida
        System.out.printf("Foram necessarios %.1f litros de combustivel\n", consumo);
    }
}