package lista1;
import java.util.Scanner;

public class exercicio3 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //Entrada
    System.out.println("Digite um número inteiro: ");
    int numero = scanner.nextInt();

    //Processamento
    int numeroQuadrado = numero * numero;

    //Saída
    System.out.println(("O quadrado de " + numero + " é: " + numeroQuadrado));
    scanner.close();
  }
}
