import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        double litros, tempo, velMedia, km;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tempo gasto na viagem em horas --> ");
        tempo = sc.nextDouble();
        System.out.print("Digite a velocidade média --> ");
        velMedia = sc.nextDouble();

        km = tempo * velMedia;
        litros = km / 10.5;

        System.out.println("O gasto foi de " + litros + "L");
    }
}
