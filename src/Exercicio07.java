import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double x, y, aux;

        System.out.print("Digite o valor de X --> ");
        x = sc.nextDouble();

        aux = (Math.pow(x,4) - 1.00) / (2 * Math.pow(x,2));

        y = Math.sqrt(1 + Math.pow(aux,2)) - (Math.pow(x,2) / 2);

        System.out.print("O resultado da expressão é " + df.format(y));
    }
}
