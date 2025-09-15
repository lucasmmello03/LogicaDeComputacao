package lista1;
import java.util.Scanner;

public class exercicio1 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner (System.in);

    //ENTRADA
    System.out.print("Digite um número: ");
    int numero = scanner.nextInt();

    //PROCESSAMENTO
    int numeroAntecessor = numero - 1;

    //SAÍDA
    System.out.println("O número antecessor de " + numero + " é: " + numeroAntecessor);
    scanner.close();
  }
}
