import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, dezena, centena, unidade;

        System.out.print("Digite um número inteiro de 3 digitos (100-999): ");
        numero = sc.nextInt();

        centena = (numero / 100) % 10;
        dezena = (numero / 10) % 10;
        unidade = (numero / 1) % 10;


        System.out.println("A casa da centena é --> " + centena);
        System.out.println("A casa da dezena é --> " + dezena);
        System.out.println("A casa da unidade é --> " + unidade);
        System.out.print("o inverso de " + numero + " é " + unidade + dezena + centena);
    }
}
