package Lista2;

import java.util.Scanner;

public class exercicio6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Entrada
    System.out.println("Digite sua idade em anos:");
    int idadeAnos = scanner.nextInt();

    System.out.println("Digite os meses adicionais:");
    int idadeMeses = scanner.nextInt();

    System.out.println("Digite os dias adicionais:");
    int idadeDias = scanner.nextInt();

    // Processamento
    int diasVividos = (idadeAnos * 365) + (idadeMeses * 30) + idadeDias;

    // Saída
    System.out.println("Você já vivieu: " + diasVividos + " dias.");
    scanner.close();
  }
}
