import java.util.Scanner;

public class ex07L3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Entrada
    System.out.println("Digite o n de Litro, e o tipo de combustível, A-alcool e G-gasolina:");
    float nLitros = scanner.nextFloat();
    String tipoComb = scanner.next();

    float pGas = 4.30f;
    float pAlc = 3.90f;

    float calcG = 0;
    float calcA = 0;

    // Processamento e saída
    if (tipoComb.equals("G")) {
      System.out.println("Escolheu Gasolina");
      if (nLitros <= 20) {
        calcG = pGas * nLitros * 0.96f;
        System.out.println("O preço com desconto é: R$" + calcG);
      } else {
        calcG = pGas * nLitros * 0.94f;
        System.out.println("O preço com desconto é: R$" + calcG);
      }
    } else if (tipoComb.equals("A")) {
      System.out.println("Escolheu Alcool");
      if (nLitros <= 20) {
        calcA = pAlc * nLitros * 0.97f;
        System.out.println("O preço com desconto é: R$" + calcA);
      } else {
        calcA = pAlc * nLitros * 0.95f;
        System.out.println("O preço com desconto é: R$" + calcA);
      }
    } else {
      System.out.println("Escolha G ou A, para os combustíveis");
    }
    scanner.close();
  }
}
