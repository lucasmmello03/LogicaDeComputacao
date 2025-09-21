import java.util.Scanner;

public class ex04 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de 4 dígitos:");
        int num = scanner.nextInt();

        // Processamento 1234
        int d1 = num % 10; //4
        int d2 = (num / 10) % 10;
        int d3 = (num / 100) % 10;
        int d4 = num / 1000;

        //Saída
        System.out.println("Seu número ao contrário é: " + d1 + d2 + d3 + d4);
        scanner.close();
  }
}
