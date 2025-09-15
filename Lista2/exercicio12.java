package lista2;
import java.util.Scanner;

public class exercicio12 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a quantidade de maçãs compradas:");
    int quantidadeMacas = scanner.nextInt();

    // Processamento
    double precoPorMaca;

    if (quantidadeMacas >= 12) {
      precoPorMaca = 1.50;
    } else {
      precoPorMaca = 1.30;
    }

    double precoTotal = quantidadeMacas * precoPorMaca;

    // Saída
    System.out.println("o preço total da compra é: R$" + precoTotal);
    scanner.close();
  }
}
