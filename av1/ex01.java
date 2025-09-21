import java.util.Scanner;

public class ex01 {
  public static void main(String[] args) {
    Scanner scannner = new Scanner(System.in);

    // Entrada
    System.out.println("Escreva 3 valores de ângulo para triângulos:");
    int ang1 = scannner.nextInt();
    int ang2 = scannner.nextInt();
    int ang3 = scannner.nextInt();



    //Processamento e saída
    if(ang1 == 90 || ang2 == 90 || ang3 == 90) {
      System.out.println("O seu triângulo é, retângulo");
    } else if(ang1 > 90 || ang2 > 90 || ang3 > 90) {
      System.out.println("O seu triângulo é, obtuso");
    } else if (ang1 < 90 && ang2 < 90 && ang3 < 90) {
      System.out.println("O seu triângulo é, acutângulo");
    } else {
      System.out.println("Suas medidas não se enquadram nas definições, tente com outras");
    }
    scannner.close();
  }
}
