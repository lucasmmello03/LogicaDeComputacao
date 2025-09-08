package Lista1;


import java.util.Scanner;

public class exercicio7 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    //ENTRADA
    System.out.println("Digite a distância em Km:");
    double distancia = scanner.nextDouble();

    System.out.println("Digite a velocidade média em Km/h:");
    double velocidade = scanner.nextDouble();

    //PROCESSAMENTO
    double tempo = distancia / velocidade;

    //SAÍDA
    System.out.println("O tempo estimado para a viagem é de " + tempo + " horas.");

     scanner.close();
  }
}


