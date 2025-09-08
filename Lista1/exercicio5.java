package Lista1;


import java.util.Scanner;

public class exercicio5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Entrada
    System.out.println("Digite a temperatura em Fahrenheit: ");
    double fahrenheit = scanner.nextDouble();

    //Processamento
    double celsius = ( (fahrenheit - 32) * 5 /9);

    //Saída
    System.out.println("A temperatura agora em Celsius é: " + celsius);
    scanner.close();
  }
}
