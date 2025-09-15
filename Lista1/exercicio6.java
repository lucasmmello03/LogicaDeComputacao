package lista1;
import java.util.Scanner;

public class exercicio6 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    //Entrada
    System.out.println("Digite a nota 1: ");
    double nota1 = scanner.nextDouble();
    System.out.println("Digite a nota 2: ");
    double nota2 = scanner.nextDouble();

   //Processamento
    double calculoMedia = (nota1 + nota2) / 2;

    //Saída
    System.out.println("A média é: " + calculoMedia);
    scanner.close();
  }
}

