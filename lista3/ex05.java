package lista3;

import java.util.Scanner;

public class ex05 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Entrada
    System.out.println("Digite os lados A, B e C: ");
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();

    // Processamento e Saída
    if (a > 0 && b > 0 && c > 0 && a < b + c && b < a + c && c < a + b) {
      System.out.println("Suas medidas formam um triângulo");
    } else {
      System.out.println("Suas medidas não formam um triângulo");
    }
    scanner.close();
  }
}
