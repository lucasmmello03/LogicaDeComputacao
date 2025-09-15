package lista2;
import java.util.Scanner;

public class exercicio1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Faça um algoritmo que converta metros para centímetros.
    // Lembrando que 1m = 100cm

    // Entrada
    System.out.println("Digite o valor em metros: ");
    double valorMetros = scanner.nextDouble();

    // Processamento
    double valorCentimetros = valorMetros * 100;

    // Saída
    System.out.println("Seu valor em cm é: " + valorCentimetros + "cm");
    scanner.close();
  }
}
