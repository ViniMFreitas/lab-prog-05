import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        double valorAulaHora, horasTrabalhadas, porcentagemDesc, salarioBruto, salarioFinal;

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0,000.00");

        System.out.print("Digite o valor da hora-aula --> ");
        valorAulaHora = sc.nextDouble();
        System.out.print("Digite o numero de horas trabalhadas esse mês --> ");
        horasTrabalhadas = sc.nextDouble();
        System.out.print("Digite a porcentagem do desconto do INSS --> ");
        porcentagemDesc = sc.nextDouble();

        salarioBruto = horasTrabalhadas * valorAulaHora;
        salarioFinal = salarioBruto - (salarioBruto * (porcentagemDesc * 0.01));

        System.out.println("O salário bruto sem desconto é: R$" + df.format(salarioBruto));
        System.out.println("O seu salário final, já com os descontos do INSS é: R$" + df.format(salarioFinal));
    }
}
