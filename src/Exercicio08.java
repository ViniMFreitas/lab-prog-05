import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, dezena;

        System.out.print("Digite um número inteiro de 3 digitos (100-999): ");
        numero = sc.nextInt();

        dezena = (numero / 1) % 10;

        System.out.println("A casa da dezena é " + dezena);
    }
}
