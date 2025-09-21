import java.util.Scanner;

public class desconto {
  /*
   * FACA UM PROGRAMA QUE DADO O VALOR DE UMA COMPRA APLIQUE UM DESCONTO CONFORME
   * A SEGUINTE TABELA
   *
   * < R$ 100 - NAO TEM DESCONTO
   * >= 100 && < 500 5% DESCONTO
   * >= 500 && < 1000 10% DESCONTO
   * > 1000 20% DESCONTO
   */

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Entrada
    System.out.println("Digite o valor da compra:");
    double compra = scanner.nextDouble();

    double compra5;
    double compra10;
    double compra20;
    double totalCompra;

    // Processamento
    if (compra < 100) {
      System.out.println("O valor da sua compra é de: R$" + compra + " Sem desconto");
    } else if (compra >= 100 && compra < 500) {
      compra5 = (compra * 0.05);
      totalCompra = compra - compra5;
      System.out.println("O valor da sua compra é de: R$" + totalCompra + " com 5% de desconto");
    } else if (compra >= 500 && compra < 1000) {
      compra10 = (compra * 0.10);
      totalCompra = compra - compra10;
      System.out.println("O valor da sua compra é de: R$" + totalCompra + " com 10% de desconto");
    } else {
      compra20 = (compra * 0.20);
      totalCompra = compra - compra20;
      System.out.println("O valor da sua compra é de: R$" + totalCompra + " com 20% de desconto");
    }
    scanner.close();
  }
}
