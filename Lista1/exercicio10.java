package lista1;

import java.util.Scanner;

public class exercicio10 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //Entrada
    System.out.println("Para iniciar introduza as informações abaixo");
    int valorIngresso, numPessoasSocio, numPessoasNaoPagante, numPessoasSemDesconto;

    System.out.println("Valor do ingresso:");
    valorIngresso = scanner.nextInt();

    System.out.println("Número de sócios:");
    numPessoasSocio = scanner.nextInt();

    System.out.println("Número de pessoas não pagantes:");
    numPessoasNaoPagante = scanner.nextInt();

    System.out.println("Número de pessoas sem desconto:");
    numPessoasSemDesconto = scanner.nextInt();

    //Processamento
    int publicoTotal = numPessoasSocio + numPessoasNaoPagante + numPessoasSemDesconto;

    int totalArrecadado;

    if (numPessoasSocio > 0) {
      totalArrecadado = (numPessoasSocio * (valorIngresso / 2)) + (numPessoasSemDesconto * valorIngresso);
    } else {
      totalArrecadado = numPessoasSemDesconto * valorIngresso;
    }
    int valoresNaoArrecadados = numPessoasSocio * (valorIngresso / 2) + numPessoasNaoPagante * valorIngresso;

    //Saída
    System.out.println("Público total: " + publicoTotal);
    System.out.println("Total arrecadado R$" + totalArrecadado);
    System.out.println("Valores não arrecadados R$" + valoresNaoArrecadados);
    scanner.close();
  }
}
