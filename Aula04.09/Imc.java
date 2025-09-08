
import java.util.Scanner;

public class Imc {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite seu peso (kg): ");
    double peso = scanner.nextDouble();

    System.out.println("Digite sua altura (m): ");
    double altura = scanner.nextDouble();

    double imc = peso / (altura * altura);

    if( imc < 18.5) {
      System.out.println("Você está abaixo do peso");
      }
      else if(imc >= 18.5 && imc < 25) {
        System.out.println("Você está com o peso normal");
      }
      else if (imc >= 25 && imc < 30) {
          System.out.println("Você está acima do peso");
        }
      else {
            System.out.println("Você está obeso");
          }
    scanner.close();
  }
}
