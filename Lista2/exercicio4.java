package lista2;
import java.util.Scanner;

public class exercicio4 {
  public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     //Entrada
     int num1, num2;

     System.out.println("Digite seu primeiro número: ");
      num1 = scanner.nextInt();

      System.out.println("Digite seu segundo número: ");
      num2 = scanner.nextInt();

      //Processamento
      if(num1 > num2){
        System.out.println("O número maior é: " + num1);
      } else {
        System.out.println("O número maior é: " + num2);
       }
      scanner.close();
  }
}
