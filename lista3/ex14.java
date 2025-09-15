package lista3;

import java.util.Scanner;

public class ex14 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Entrada
    System.out.println("Digite suas 3 notas:");
    float n1 = scanner.nextFloat();
    float n2 = scanner.nextFloat();
    float n3 = scanner.nextFloat();

    float media = (n1 + n2 + n3) / 3;

    // Processamento
    if (media >= 9.0f) {
      System.out.println("Aluno se enquadra no conceito A, e sua média é: " + media);
    } else if (media >= 7.5f && media < 9.0f) {
      System.out.println("Aluno se enquadra no conceito B, e sua média é: " + media);
    } else if (media >= 6.0f && media < 7.5f) {
      System.out.println("Aluno se enquadra no conceito C, e sua média é: " + media);
    } else {
      System.out.println("Aluno se enquadra no conceito D, e sua média é: " + media);
    }
    scanner.close();
  }
}
