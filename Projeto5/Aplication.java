package Projeto5;

import java.util.Scanner;

public class Aplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();
        Calculadora calculadora = new Calculadora(num1,num2);
        calculadora.Soma(num1,num2);
        calculadora.Subtracao(num1,num2);
        calculadora.Multiplicacao(num1,num2);
        calculadora.Divisao(num1,num2);

        System.out.println(calculadora.toString());





    }
}
