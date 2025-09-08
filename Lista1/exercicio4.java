package Lista1;
import java.util.Scanner;

public class exercicio4 {
  public static void main(String[] args){

    Scanner scanner = new Scanner (System.in);

    //Entrada
    System.out.println("Digite a base do triângulo: ");
    int baseTriangulo = scanner.nextInt();

    System.out.println("Digite a altura do triângulo: ");
    int alturaTriangulo = scanner.nextInt();

    //Processamento
    int areaTriangulo = baseTriangulo * alturaTriangulo / 2;

    //Saída
    System.out.println("A área do triângulo é: " + areaTriangulo);
    scanner.close();
   }
}

