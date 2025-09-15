package lista2;
import java.util.Scanner;

public class exercicio9 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Entrada
    System.out.println("Digite o raio da circunferência em cm: ");
    float raio = scanner.nextFloat();

    // Processamento
    float pi = 3.141692f;
    float diametro = 2 * raio;
    float comprimento = 2 * pi * raio;
    float area = 2 * (pi * (raio * raio));

    // Saída
    System.out.println("O diâmetro da circunferência é: " + diametro + " cm");
    System.out.println("O comprimento da circunferência é: " + comprimento + " cm");
    System.out.println("A área da circunferência é: " + area + " cm²");
    scanner.close();
  }
}
