package membros_estaticos.Exercicio;

import membros_estaticos.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ConversorDolar conversorDolar = new ConversorDolar();

        System.out.print("Digite o valor atual do Dorlá: ");
        double dolarPrice= sc.nextDouble();

        System.out.print("Qual o valor que deseja comprar o dolá? ");
        double valorReal = sc.nextDouble();

        double real =  conversorDolar.dola_Real(valorReal,dolarPrice);
        System.out.printf("Valor Total da compra: R$ %.2f%n",real);

       // double conversor = ConversorDolar.dolá_Real(dolár);





    }
}
