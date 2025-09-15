package lista1;
import java.util.Scanner;

public class exercicio2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);

    //ENTRADA
    System.out.print("Digite um número: ");
    int numero = scanner.nextInt();


    //PROCESSAMENTO
    int numero20PorcentoAcima = numero + (numero * 20/100);


    //SAÍDA
    System.out.println("O número 20% acima de " + numero + " é: " + numero20PorcentoAcima);
    scanner.close();
  }
}
