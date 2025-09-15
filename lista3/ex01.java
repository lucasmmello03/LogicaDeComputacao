package lista3;

import java.util.Scanner;

public class ex01 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um valor: ");
    int n1 = scanner.nextInt();

    if (n1 > 0) {
      System.out.println("Seu número é positivo: " + n1);
    } else if (n1 == 0) {
      System.out.println("Seu número é: " + n1);
    } else {
      System.out.println("Seu número é negativo: " + n1);
    }
    scanner.close();
  }
}
