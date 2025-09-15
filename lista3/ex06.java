package lista3;

import java.util.Scanner;

public class ex06 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Escreva o nome de dois times:");
    String nt1 = scanner.nextLine();
    String nt2 = scanner.nextLine();

    System.out.println("Digite o número de gols para cada time:");
    int gt1 = scanner.nextInt();
    int gt2 = scanner.nextInt();

    // Processamento e Saída
    if (gt1 > gt2) {
      System.out.println("O time vencedor é: " + nt1);
    } else if (gt1 == gt2) {
      System.out.println("EMPATE");
    } else {
      System.out.println("O time vencedor é: " + nt2);
    }
    scanner.close();
  }
}
