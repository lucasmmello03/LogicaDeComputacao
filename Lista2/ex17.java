package lista2;

import java.util.Scanner;

public class ex17 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Entrada
    System.out.println("Digite o valor do custo de fábrica do veículo:");
    float cFab = scanner.nextFloat();

    // Processamento
    float perctDistri = 0.28f;
    float perctImpost = 0.45f;
    float valorDistri = cFab * perctDistri;
    float valorImpost = cFab * perctImpost;
    float cFinal = cFab + valorDistri + valorImpost;

    // Saída
    System.out.println("O custo final do veículo é: R$" + cFinal);
    scanner.close();
  }
}
