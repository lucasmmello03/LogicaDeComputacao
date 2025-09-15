package lista3;

import java.util.Scanner;

public class ex11 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Entrada
    System.out.println("Digite o número de lados e a medida do lado, em cm:");
    int nL = scanner.nextInt();
    int medL = scanner.nextInt();

    int perimetro;
    int area;

    // Processamento e saída
    if (nL == 3) {
      perimetro = medL * nL;
      System.out.println("TRIANGULO -" + " O seu perímetro é: " + perimetro + "cm");
    } else if (nL == 4) {
      area = medL * medL;
      System.out.println("QUADRADO -" + " A sua área é: " + area + "cm2");
    } else if (nL == 5) {
      System.out.println("PENTAGONO");
    } else {
      System.out.println("Número de lados inválido! Digite apenas 3, 4 ou 5");
    }
    scanner.close();
  }
}
