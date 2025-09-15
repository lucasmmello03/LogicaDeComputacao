package lista2;

import java.util.Scanner;

public class ex18 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Entrada
    System.out.println("Digite o número de carros vendidos:");
    int nCarros = scanner.nextInt();

    System.out.println("Digite o valor total de suas vendas:");
    float vTotalV = scanner.nextFloat();

    System.out.println("Digite o valor do seu saláario:");
    float salario = scanner.nextFloat();

    System.out.println("Digite sua comissão por carro vendido:");
    float vCarroV = scanner.nextFloat();

    // Processamento
    float pVend = vTotalV * 0.05f;
    float comissaoTotal = (nCarros * vCarroV) + pVend;
    float salarioFinal = salario + comissaoTotal;

    // Saída
    System.out.println("O salário final do vendedor, considerando suas comissões é: R$" + salarioFinal);
    scanner.close();
  }
}
