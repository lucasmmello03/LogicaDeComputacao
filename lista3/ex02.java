package lista3;

import java.util.Scanner;

public class ex02 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite 3 valores:");
    int n1 = scanner.nextInt();
    int n2 = scanner.nextInt();
    int n3 = scanner.nextInt();

    if (n1 > n2 && n1 > n3) {
      System.out.println("O número 1 é o maior: " + n1);
    } else if (n2 > n1 && n2 > n3) {
      System.out.println("O número 2 é o maior: " + n2);
    } else {
      System.out.println("O número 3 é o maior: " + n3);
    }
    scanner.close();
  }
}
