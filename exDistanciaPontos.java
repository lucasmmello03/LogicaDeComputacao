import java.util.Scanner;

public class exDistanciaPontos {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Entrada
    System.out.println("Digite 2 pontos para x e 2 pontos para y");
    int x1 = scanner.nextInt();
    int x2 = scanner.nextInt();
    int y1 = scanner.nextInt();
    int y2 = scanner.nextInt();

    // Processamento
    int diferencaX = x2 - x1;
    int diferencaY = y2 - y1;
    int cDPontos = (diferencaX * diferencaX) + (diferencaY * diferencaY);

    // Saída
    System.out.println("O resultado da dist entre os pontos é: " + cDPontos);
    scanner.close();
  }
}
