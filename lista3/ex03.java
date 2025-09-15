package lista3;

import java.util.Scanner;

public class ex03 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Entrada
    System.out.println("Digite 3 valores: ");
    int n1 = scanner.nextInt();
    int n2 = scanner.nextInt();
    int n3 = scanner.nextInt();

    int somaTotal;
    int somaMaiores;
    int menor = 0;

    // Processamento
    if (n1 < n2 && n1 < n3) {
      menor = n1;
    } else if (n2 < n1 && n2 < n3) {
      menor = n2;
    } else if (n3 < n1 && n3 < n2) {
      menor = n3;
    }

    somaTotal = n1 + n2 + n3;
    somaMaiores = somaTotal - menor;

    // Saída
    System.out.println("A soma dos maiores valores é: " + somaMaiores);
    scanner.close();
  }
}
