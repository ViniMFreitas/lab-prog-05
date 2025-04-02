import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        double salMin, qtdKw, valorKw, total, totalComDesconto;

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Digite o valor do salário minimo --> ");
        salMin = sc.nextDouble();
        System.out.print("Digite a quantidade de KW consumido --> ");
        qtdKw = sc.nextDouble();

        valorKw = (salMin / 7) / 100;
        total = valorKw * qtdKw;
        totalComDesconto = total * 0.9;

        System.out.println("Valor do KW R$ " + df.format(valorKw));
        System.out.println("Total a pagar R$ " + df.format(total));
        System.out.println("Total a pagar com 10% de desconto R$ " + df.format(totalComDesconto));
    }
}
