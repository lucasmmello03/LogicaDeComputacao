package lista3;

import java.util.Scanner;

public class ex10 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //Entrada
    System.out.println("Digite sua altura e o sexo:");
    float h = scanner.nextFloat();
    int sexo = scanner.nextInt();

    float pesoH;
    float pesoM;

    //Processamento e saída
    if(sexo == 1) {
      pesoM = (62.1f * h) - 44.7f;
      System.out.println("Seu peso ideial é: " + pesoM);
    } else if(sexo == 2) {
      pesoH = (72.7f * h) - 58;
      System.out.println("Seu peso ideial é: " + pesoH);
    } else {
      System.out.println("Tente noavemente digitando os valores 1 - feminino, e 2 - masculino");
    }
    scanner.close();
  }
}
