import java.util.Scanner;

public class operadoresLogicos {
    public static void main(String[] args) {

    Scanner scanner = new Scanner (System.in);

    


  System.out.println("Escolha 2 números");
  int num1 = scanner.nextInt();
  int num2 = scanner.nextInt();

  // Desenvolver os números em ordem crescente
  if(num1 < num2){
    System.out.println("Ordem crescente "+ num1 + ", " + num2 );

  }else {
    System.out.println("Ordem crescente " + num2 + ", " + num1);
  }
  scanner.close();
 }
}
