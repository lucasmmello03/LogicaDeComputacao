
import java.util.Scanner;

public class CaixasPiso {

    public static void main (String [] args) {

        Scanner in = new Scanner(System.in);

        /*
         O fulano quria colocar piso novo em sua sala
         faça um programa que dado as dimensões de uma sala (comprimento e largura) e a quantidade de
         m2 em cada caixa de piso, determine quantas caixas devem ser compradas. Considere a adição de 10%
         da area total para considerar possíveis quebras e recortes.
         */

    //variáveis do programa
    float comprimento, largura, area, m2, totalCaixas;
    // TIPO NOME (caixinha nomeada)

    //ENTRADA
    System.out.println("Informe as dimensoes do comodo");
    comprimento = in.nextFloat();
    largura = in.nextFloat();


    //PROCESSAMENTO
    area = comprimento * largura;
    System.out.println("Sua área é: " + area);


    System.out.println("Quantos m2 cada caixa cobre?");
    m2 = in.nextFloat();


    //SAÍDA
    totalCaixas = area * 1.1f /m2;
    System.out.println("Total de caixas " + totalCaixas);
    in.close();
    }
}
