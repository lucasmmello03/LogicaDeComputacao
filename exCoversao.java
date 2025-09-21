import java.util.Scanner;

public class exCoversao {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Entrada´
    System.out.println("Digite um num de 4 digitos:");
    int n = scanner.nextInt();

    int u, d, c, m;

    // Processamento
    u = n % 10;
    d = (n / 10) % 10;
    c = (n / 100) % 10;
    m = n / 1000;

    // Saída
    System.out.println("O número invertido é: " + u + d + c + m);
    scanner.close();
  }
}
