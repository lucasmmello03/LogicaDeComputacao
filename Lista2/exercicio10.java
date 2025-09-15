package lista2;
import java.util.Scanner;

public class exercicio10 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Entrada
    System.out.println("Escreva a idade do nadador, para classificá-lo: ");
    int idade = scanner.nextInt();

    // Processamento e Saída
    if (idade >= 18) {
      System.out.println("A categoria do nadador é: Adulto");
    } else if (idade >= 14 && idade < 18) {
      System.out.println("A categoria do nadador é: Juvenil");
    } else if (idade >= 9 && idade < 14) {
      System.out.println("A categoria do nadador é: Infantil");
    } else {
      System.out.println("A categoria do nadador é: Mirim");
    }
    scanner.close();
  }
}
