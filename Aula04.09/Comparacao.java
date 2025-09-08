import java.util.Scanner;

public class Comparacao {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digiite sua idade: ");
    int idade = scanner.nextInt();

    if(idade < 18) {
      System.out.println("Voce é menor de idade");
    } else if (idade >= 18 && idade < 60){
      System.out.println("Você é adulto");
    } else {
      System.out.println("Você é idoso");
    }
    scanner.close();
  }
}
