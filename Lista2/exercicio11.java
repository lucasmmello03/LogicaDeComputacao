package Lista2;

import java.util.Scanner;

public class exercicio11 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o primeiro número:");
    int num1 = scanner.nextInt();

    System.out.println("Digite o segundo número:");
    int num2 = scanner.nextInt();

    // Processamento e saída
    int soma = num1 + num2;

    if (soma > 20) {
      System.out.println("O valor da primeira soma é: " + soma);
      soma += 8;
      System.out.println("O valor da soma mais 8 é: " + soma);
    } else {
      System.out.println("O valor da primeira soma é: " + soma);
      soma -= 10;
      System.out.println("O valor da soma menos 10 é: " + soma);
    }
    scanner.close();
  }
}
