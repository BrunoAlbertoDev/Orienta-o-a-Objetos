package Projeto3;

import java.util.Locale;
import java.util.Scanner;

public class Aplication {

    /**
     * Fazer um programa para ler os valores da largura e altura
     * de um retângulo. Em seguida, mostrar na tela o valor de
     * sua área, perímetro e diagonal. Usar uma classe como
     * mostrado no projeto ao lado.
     *
     * Enter rectangle width and height:
     * 3.00
     * 4.00
     * AREA = 12.00
     * PERIMETER = 14.00
     * DIAGONAL = 5.00
     * E
     *
     * @param args
     */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.println("Enter rectangle widht and height: ");

        retangulo.width = sc.nextDouble();
        retangulo.height = sc.nextDouble();

        System.out.println(retangulo.toString());


        sc.close();
    }
}
