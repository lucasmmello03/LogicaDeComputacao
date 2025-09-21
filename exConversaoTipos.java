import java.util.Scanner;

public class exConversaoTipos {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Entrada
    System.out.println("Digite 2 numeros, umm inteiro e outro deciaml:");
    int n1 = scanner.nextInt();
    float n2 = scanner.nextFloat();

    // Processamento
    float c1 = (float) n1;
    int c2 = (int) n2;

    // Saída
    System.out.println("Os número convertidos são: " + c1 + " espaço " + c2);
    scanner.close();
  }
}
