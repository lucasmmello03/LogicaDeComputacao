package lista3;

import java.util.Scanner;

public class ex04 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Entrada
    System.out.println("Digite 3 valores:");
    int n1 = scanner.nextInt();
    int n2 = scanner.nextInt();
    int n3 = scanner.nextInt();

    int menor = 0;
    int meio = 0;
    int maior = 0;

    //Processamento
    if (n1 < n2 && n1 < n3) {
      menor = n1;
    } else if (n2 < n1 && n2 < n3) {
      menor = n2;
    } else if (n3 < n1 && n3 < n2) {
      menor = n3;
    }

    if (n1 > n2 && n1 > n3) {
      maior = n1;
    } else if (n2 > n1 && n2 > n3) {
      maior = n2;
    } else if (n3 > n1 && n3 > n2) {
      maior = n3;
    }

    if (n1 != maior && n1 != menor) {
      meio = n1;
    } else if (n2 != maior && n2 != menor) {
      meio = n2;
    } else if (n3 != maior && n3 != menor) {
      meio = n3;
    }

    //Saída
    System.out.println("A ordem crescente é: " + menor + meio + maior);
    scanner.close();
  }
}
