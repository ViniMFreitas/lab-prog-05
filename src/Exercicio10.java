import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, bit1, bit2, bit3, bit4, resultado;

        System.out.print("Digite um numero formado por 4 bist (ex: 1010) --> ");
        numero = sc.nextInt();

        bit1 = numero % 10;
        bit2 = (numero / 10) % 10;
        bit3 = (numero / 100) % 10;
        bit4 = (numero / 1000) % 10;


        resultado = bit1 + (bit2 * 2) + (bit3 * 4) + (bit4 * 8);

        System.out.print("O número " + numero + " em decimal é " + resultado);
    }
}
