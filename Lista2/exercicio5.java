package lista2;
import java.util.Scanner;

public class exercicio5 {
      public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            // Entrada
            int num1, num2;

            System.out.println("Escolha o numero 1: ");
            num1 = scanner.nextInt();

            System.out.println("Escolha o numero 2: ");
            num2 = scanner.nextInt();

            // Processamento e Saida
            if (num2 == 0) {
                  System.out.println("Impossivel dividir por 0, tente novamente com outros valores.");
            } else {
                  int calculoDivisao = num1 / num2;
                  System.out.println("Sua divisao é: " + calculoDivisao);
            }
            scanner.close();
      }
}
