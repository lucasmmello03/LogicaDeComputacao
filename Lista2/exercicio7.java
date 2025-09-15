package lista2;
import java.util.Scanner;

public class exercicio7 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Entrada
    System.out.println("Digite o seu valor ganho por hora: ");
    double valorHora = scanner.nextDouble();

    System.out.println("Digite o número de horas trabalhadas no mês: ");
    double horasTrabalhadas = scanner.nextDouble();

    System.out.println("Digite a porcentagem de desconto do INSS: ");
    double descontoINSS = scanner.nextDouble();

    // Processamento
    double salarioBruto = valorHora * horasTrabalhadas;
    double salarioLiquido = salarioBruto - (salarioBruto * descontoINSS / 100);

    // Saída
    System.out.println("Seu salário bruto é R$ " + salarioBruto);
    System.out.println("Seu salário líquido é R$ " + salarioLiquido);
    scanner.close();
  }
}
