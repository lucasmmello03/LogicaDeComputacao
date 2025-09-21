package lista3;

import java.util.Scanner;

public class ex08 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Entrada
    System.out.println("Escreva o código do usuário:");
    String usuario = scanner.next();

    String defaultUser = "1234";
    String defaultPassword = "9999";

    // Processamento e saída
    if (!usuario.equals(defaultUser)) {
      System.out.println("Usuario inválido");
    } else {
      System.out.println("Digite sua senha:");
      String senha = scanner.next();
      if (senha.equals(defaultPassword)) {
        System.out.println("Usuário validado!");
      } else {
        System.out.println("Senha incorreta");
      }
    }
    scanner.close();
  }
}
