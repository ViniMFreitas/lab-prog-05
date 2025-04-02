import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        double tempC, tempF;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a temperatura em Cº: ");
        tempC = sc.nextDouble();
        tempF = tempC * 9/5 + 32;
        System.out.print("A temperatura em Fº é " + tempF + "ºF");
    }
}
