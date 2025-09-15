package lista2;
import java.util.Scanner;

public class exercicio13 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Entrada
    System.out.println("Digite a nota 1: ");
    double nota1 = scanner.nextDouble();

    System.out.println("Digite a nota 2: ");
    double nota2 = scanner.nextDouble();

    double mediaAritmetica = (nota1 + nota2) / 2;

    // Processamento e Saída
    if (mediaAritmetica >= 6) {
      System.out.println("Aluno aprovado, sua média é: " + mediaAritmetica);
    } else {
      System.out.println("Aluno reprovado, sua média é: " + mediaAritmetica);
    }
    scanner.close();
  }
}
