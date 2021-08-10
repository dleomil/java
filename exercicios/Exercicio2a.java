/* ideia do exercicio:
   praticar E -> P -> S

   E: basicamente ler o valor (vindo do usuário) para o lado
   P: calcular a área do quadrado
   S: Exibir essa área (perfumaria: com 3 casas decimais)
*/

// pre-requisito: preciso importar a biblioteca de leitura
import java.util.Scanner;

// cabecalho da classe
public class Exercicio2a{
    // cabecalho do módulo principal
    public static void main(String args[]){
        // preciso do componente de leitura
        Scanner teclado = new Scanner(System.in);

        // preciso das variáveis(quais? lado para o usuário inputar e area para ser calculada)
        double lado, area;

        // entrada:
        System.out.println("Por favor, digite o valor do lado");
        lado = teclado.nextDouble();

        // processamento
        area = lado * lado;

        // saída
        System.out.printf("Valor da area = %.3f\n",area);
    }
}