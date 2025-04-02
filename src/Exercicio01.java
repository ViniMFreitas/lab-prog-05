import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        double base, altura, area, perimetro;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a medida da base do retangulo: ");
        base = sc.nextDouble();
        System.out.print("Digite a medida da altura do retangulo: ");
        altura = sc.nextDouble();

        area = base * altura;
        perimetro = (2 * base) + (2 * altura) ;

        System.out.println("A área do retangulo é: " + area + " e o perimetro é: " + perimetro);

    }
}
