package lista3;

import java.util.Scanner;

public class ex08 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Entrada
    System.out.println("Digite seu código:");
    int code = scanner.nextInt();

    int defaulfCode = 1234;
    int defaultSenha = 9999;

    // Processamento e saída
    if (code != defaulfCode) {
      System.out.println("Usuário Inválido");
    } else {
      System.out.println("Digite sua senha:");
      int senha = scanner.nextInt();
      if (senha != defaultSenha) {
        System.out.println("Senha incorreta");
      } else {
        System.out.println("Acesso permitido");
      }
    }
    scanner.close();
  }
}
