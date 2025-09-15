package lista2;
import java.util.Scanner;

public class exercicio15 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Entrada
    System.out.println("Digite o horário de início do jogo, em horas: ");
    int inicio = scanner.nextInt();

    System.out.println("Digite o horário de fim do jogo, em horas: ");
    int fim = scanner.nextInt();

    // Processamento
    int tempoPartida = fim - inicio;

    // Saída
    System.out.println("O tempo total do jogo foi: " + tempoPartida);
    scanner.close();
  }
}
