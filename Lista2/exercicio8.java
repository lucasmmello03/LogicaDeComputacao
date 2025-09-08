package Lista2;

import java.util.Scanner;

public class exercicio8 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    // Entrada
    System.out.println("Digite o número total de eleitores: ");
    int numEleitores = scanner.nextInt();

    System.out.println("Digite o número de votos brancos: ");
    int votosBrancos = scanner.nextInt();

    System.out.println("Digite o número de votos nulos: ");
    int votosNulos = scanner.nextInt();

    System.out.println("Digite o número de votos válidos: ");
    int votosValidos = scanner.nextInt();

    // Processamento
    int percentualBrancos = (votosBrancos * 100) / numEleitores;
    int percentualNulos = (votosNulos * 100) / numEleitores;
    int percentualValidos = (votosValidos * 100) / numEleitores;

    // Saída
    System.out.println("Percentual de votos brancos: " + percentualBrancos + "%");
    System.out.println("Percentual de votos nulos: " + percentualNulos + "%");
    System.out.println("Percentual de votos válidos: " + percentualValidos + "%");
    scanner.close();
  }
}
