import java.util.Scanner;

public class maiorNum {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Entrada
    System.out.println("Digite 3 número, para verificar qual o maior deles:");
    int n1 = scanner.nextInt();
    int n2 = scanner.nextInt();
    int n3 = scanner.nextInt();

    int maior;

    // Processamento e saída
    if (n1 > n2 && n1 > n3) {
      maior = n1;
      System.out.println("O maior é o: " + maior);
    } else if (n2 > n1 && n2 > n3) {
      maior = n2;
      System.out.println("O maior é o: " + maior);
    } else {
      maior = n3;
      System.out.println("O maior é o: " + maior);
    }
    scanner.close();
  }
}
