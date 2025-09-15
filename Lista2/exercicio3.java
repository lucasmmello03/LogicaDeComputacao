package lista2;
import java.util.Scanner;

public class exercicio3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Faça um algoritmo que leia um número inteiro e diga se ele é positivo ou
    // negativo.
    System.out.println("Escolha um número inteiro: ");
    int valor = scanner.nextInt();

    if (valor >= 0) {
      System.out.println("O número é positivo: " + valor);
    } else {
      System.out.println("Onúmero é negativo: " + valor);
    }
    scanner.close();
  }
}
