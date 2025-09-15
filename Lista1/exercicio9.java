package lista1;
import java.util.Scanner;

public class exercicio9 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //ENTRADA
    System.out.println("Cálculo de churrasco");

    System.out.println("Digite o número de homens: ");
    int numeroHomens = scanner.nextInt();

    System.out.println("Digite o número de mulheres: ");
    int numeroMulheres = scanner.nextInt();

    System.out.println("Digite o número de crianças: ");
    int numeroCriancas = scanner.nextInt();

    //PROCESSAMENTO
    int carneHomens = numeroHomens * 400 + 20/ 100;
    int carneMulheres = numeroMulheres * 320;
    int carneCriancas = numeroCriancas * 200;

    //SAÍDA
    int totalCarne = carneHomens + carneMulheres + carneCriancas + 20/100;
    int totalCarneKg = totalCarne / 1000;
    System.out.println("A quantidade total de carne necessária para o churrasco é: " + totalCarneKg + " kilos.");
    scanner.close();
  }
}
