import java.util.Scanner;

public class exCaixasPiso {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Entrada
    System.out.println("Digite as dimensões da sala, comprimento e largura, e a qtd de m2 em cada cx de piso: ");
    float comp = scanner.nextFloat();
    float largura = scanner.nextFloat();
    float cxPiso = scanner.nextFloat();

    // Processamento
    float area = comp * largura;
    float areaAcres = area * 1.10f;

    int qntCx = (int) (areaAcres / cxPiso);

    // Saída
    System.out.println("A qtd de caixas necesária é: " + qntCx);
    scanner.close();
  }
}
