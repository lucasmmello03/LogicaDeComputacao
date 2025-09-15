package lista3;

import java.util.Scanner;

public class ex13 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Entrada
    System.out.println("Digite o nome do produto:");
    String nP = scanner.nextLine();

    System.out.println("Digite a quantidade adquirida desse produto");
    int qtdP = scanner.nextInt();

    System.out.println("Digite o preço por unidade desse produto:");
    float preco = scanner.nextFloat();

    float total = qtdP * preco;
    float totalD;
    float totalPagar;

    // Processamento e Saída
    if (qtdP <= 5) {
      totalD = total * 0.02f;
      totalPagar = total - totalD;
      System.out
          .println("O total da compra do produto " + nP + " foi de: R$" + total + ", O desconto foi de R$" + totalD
              + ", O valor a pagar é de: R$" + totalPagar);
    } else if (qtdP > 5 && qtdP <= 10) {
      totalD = total * 0.03f;
      totalPagar = total - totalD;
      System.out
          .println("O total da compra do produto " + nP + " foi de: R$" + total + ", O desconto foi de R$" + totalD
              + ", O valor a pagar é de: R$" + totalPagar);
    } else {
      totalD = total * 0.05f;
      totalPagar = total - totalD;
      System.out
          .println("O total da compra do produto " + nP + " foi de: R$" + total + ", O desconto foi de R$" + totalD
              + ", O valor a pagar é de: R$" + totalPagar);
    }
    scanner.close();
  }
}
