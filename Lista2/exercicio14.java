package Lista2;

import java.util.Scanner;

public class exercicio14 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Entrada
    System.out.println("Digite o ano atual: ");
    int anoAtual = scanner.nextInt();

    System.out.println("Digite o ano que você nasceu: ");
    int anoNascimento = scanner.nextInt();

    int calculo = anoAtual - anoNascimento;

    // Processamento
    if (calculo >= 16) {
      System.out.println("Você poderá votar nas eleições desse ano.");
    } else {
      System.out.println("Você ainda não tem possui a idade mínima para votar.");
    }
    scanner.close();
  }
}
