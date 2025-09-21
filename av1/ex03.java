import java.util.Scanner;

public class ex03 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Entrada
    System.out.println("Informe as notas disponíveis em ordem crescente:");
    int nMenor = scanner.nextInt();
    int nMeio = scanner.nextInt();
    int nMaior = scanner.nextInt();

    System.out.println("Informe o valor a sacar:");
    int valor = scanner.nextInt();

    int qtdMaior;
    int qtdMeio;
    int qtdMenor;

    qtdMaior = valor / nMaior;
    valor = valor % nMaior;

    qtdMeio = valor / nMeio;
    valor = valor % nMeio;

    qtdMenor = valor / nMenor;
    valor = valor % nMenor;

    System.out.println(qtdMenor + "x" + nMenor);
    System.out.println(qtdMeio + "x" + nMeio);
    System.out.println(qtdMaior + "x" + nMaior);
    scanner.close();
  }
}
