package lista2;

import java.util.Scanner;

public class ex16 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Entrada
    System.out.println("Digite o seu salário:");
    float sal = scanner.nextFloat();

    System.out.println("Digite o valor que quer emprestado:");
    float vEmp = scanner.nextFloat();

    System.out.println("Digite o número de parcelas:");
    float nPre = scanner.nextFloat();

    float vPre = vEmp / nPre;
    float sal2 = sal * 0.3f;

    // Processamento
    if (sal > 0 && vEmp > 0 && nPre > 0) {
      if (vPre > sal2) {
        System.out.println("O empréstimo não poderá ser concedido, pois o valor excede os 30% do seu salário");
      } else {
        System.out.println("O empréstimo poderá ser concedido, e o valor da sua parcela ficará em: R$" + vPre);
      }
      scanner.close();
    } else {
      System.out.println("Os valores informados não pode ser iguais a 0, tente novamento com outros valores");
    }
  }
}
