package Lista2;

import java.util.Scanner;

public class exercicio2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Escreva um algoritmo para ler as dimensões de um retângulo (base e altura),
    // calcular e escrever a área e o perímetro do retângulo.

    // Entrada
    System.out.println("Digite a base do retàngulo: ");
    int base = scanner.nextInt();

    System.out.println("Digite a altura do retàngulo: ");
    int altura = scanner.nextInt();

    // Processamento
    int area = base * altura;
    int perimetro = 2 * (base + altura);

    // Saída
    System.out.println("A área do retângulo é: " + area);
    System.out.println("O perímetro do retângulo é: " + perimetro);
    scanner.close();
  }
}
