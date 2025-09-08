import java.util.Scanner;

public class DescontoProporcional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite o valor da sua compra: ");
        float valor = scanner.nextFloat();

        float valorFinal;

        float desconto;
        if (valor < 100) {
            System.out.println("Você não tem desconto");
        } else if (valor >= 100 && valor < 500) {
            desconto = valor * 0.05f;
            valorFinal = valor - desconto;
            System.out.println("Você tem 5% de desconto, o valor fica em: " + valorFinal);

        } else if (valor >= 500 && valor < 1000) {
            desconto = valor * 0.10f;
            valorFinal = valor - desconto;
            System.out.println("Você tem 10% de desconto, o valor fica em: " + valorFinal);

        } else {
            desconto = valor * 0.20f;
            valorFinal = valor - desconto;
            System.out.println("Você tem 20% de desconto, o valor fica em:  " + valorFinal);
        }
        scanner.close();
    }
}
