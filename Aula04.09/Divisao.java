import java.util.Scanner;

public class Divisao {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);

    System.out.println("Digite o primeiro número: ");
    int num1 = scanner.nextInt();

    System.out.println("Digite o segundo número: ");
    int num2 = scanner.nextInt();



    if(num2 == 0){
      System.out.println("Não é possível realizar a divisão, escolha outros números");
    } else {
      int resultado = num1 / num2;
      System.out.println("O resultado da sua divisão é: " + resultado );
    }
    scanner.close();
  }
}

