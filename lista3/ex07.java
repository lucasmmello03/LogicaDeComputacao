package lista3;

import java.util.Scanner;

public class ex07 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Entrada
    System.out.println("Diga o tipo de combustível, e após a quantidade de litros:");
    String tipoCombs = scanner.next();
    int qtdLitros = scanner.nextInt();

    float valorGas = 4.30f;
    float valorAlc = 3.90f;

    float calculoG = 0f;
    float calculoA = 0f;
    float descontoA;
    float descontoG;
    float valorFinal;

    // Processamento e Saída
    if (tipoCombs.equals("A")) {
      calculoA = qtdLitros * valorAlc;
      if (qtdLitros <= 20) {
        descontoA = calculoA * 0.03f;
        valorFinal = calculoA - descontoA;
        System.out.println("O valor a ser pago, com desconto, é: R$" + valorFinal);
      } else {
        descontoA = calculoA * 0.05f;
        valorFinal = calculoA - descontoA;
        System.out.println("O valor a ser pago, com desconto, é: R$" + valorFinal);
      }

    } else if (tipoCombs.equals("G")) {
      calculoG = qtdLitros * valorGas;
      if (qtdLitros <= 20) {
        descontoG = calculoG * 0.04f;
        valorFinal = calculoG - descontoG;
        System.out.println("O valor a ser pago, com desconto, é: R$" + valorFinal);
      } else {
        descontoG = calculoG * 0.06f;
        valorFinal = calculoG - descontoG;
        System.out.println("O valor a ser pago, com desconto, é: R$" + valorFinal);
      }
    }
    scanner.close();
  }
}
