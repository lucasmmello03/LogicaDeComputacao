package Lista1;
import java.util.Scanner;

public class exercicio8 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);

    //ENTRADA
    System.out.println("Para iniciar digite os dados abaixo");

    System.out.println("Digite o número de eleitores:");
    int eleitores = scanner.nextInt();

    System.out.println("Digite o número de votos válidos:");
    int votosValidos = scanner.nextInt();

    System.out.println("Digite o número de votos brancos:");
    int votosBrancos = scanner.nextInt();

    System.out.println("Digite o número de votos nulos:");
    int votosNulos = scanner.nextInt();

    //PROCESSAMENTO
    int percentualValidos = (votosValidos * 100) / eleitores;
    int percentualBrancos = (votosBrancos * 100) / eleitores;
    int percentualNulos = (votosNulos * 100) / eleitores;

    //SAÍDA
    System.out.println("Percentual de votos válidos: " + percentualValidos + "%");
    System.out.println("Percentual de votos brancos: " + percentualBrancos + "%");
    System.out.println("Percentual de votos nulos: " + percentualNulos + "%");
    scanner.close();
  }
}
