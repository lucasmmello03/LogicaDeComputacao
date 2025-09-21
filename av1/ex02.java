import java.util.Scanner;

public class ex02 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Entrada
    System.out.println("Digite o valor que deseja sacar:");
    int valorSaque = scanner.nextInt();

    // 100
    int n100 = valorSaque / 100;
    int vFalta = valorSaque % 100;

    // 50
    int n50 = vFalta / 50;
    vFalta = vFalta % 50;

    // 20
    int n20 = vFalta / 20;
    vFalta = vFalta % 20;

    // 10
    int n10 = vFalta / 10;
    vFalta = vFalta % 10;

    // 5
    int n5 = vFalta / 5;
    vFalta = vFalta % 5;

    // 2
    int n2 = vFalta / 2;
    vFalta = vFalta % 2;

    System.out.println(n100 + "x100");
    System.out.println(n50 + "x50");
    System.out.println(n20 + "x20");
    System.out.println(n10 + "x10");
    System.out.println(n5 + "x5");
    System.out.println(n2 + "x2");
    scanner.close();
  }
}
