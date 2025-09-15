package lista3;

import java.util.Scanner;

public class ex09 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Entrada
    System.out.println("Escreva a nota da primeira avaliação:");
    float nota1 = scanner.nextFloat();

    System.out.println("Escreva a nota da segunda avaliação:");
    float nota2 = scanner.nextFloat();

    System.out.println("Escreva a nota da avaliação optativa, (ou -1, se não fez):");
    float notaOp = scanner.nextFloat();

    float media = 0f;

    // Processamento
    if (notaOp == -1f) {
      media = (nota1 + nota2) / 2;
    } else {
      if (nota1 < nota2) {
        if (notaOp > nota1) {
          media = (nota2 + notaOp) / 2;
        } else {
          media = (nota1 + nota2) / 2;
        }
      } else {
        if (notaOp > nota2) {
          media = (nota1 + notaOp) / 2;
        } else {
          media = (nota1 + nota2) / 2;
        }
      }
    }

    if (media >= 6) {
      System.out.println("Sua média é: " + media + "APROVADO");
    } else if (media >= 3 && media < 6) {
      System.out.println("Sua média é: " + media + "EXAME");
    } else {
      System.out.println("Sua média é: " + media + "REPROVADO");
    }
    scanner.close();
  }
}
