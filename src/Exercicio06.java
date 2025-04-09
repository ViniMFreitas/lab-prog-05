import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x, y;

        System.out.print("Digite o valor de X --> ");
        x = sc.nextDouble();

        y = Math.sqrt(Math.cbrt(x - (0.5)));

        System.out.print("O resultado da expressão é " + y);
    }
}
