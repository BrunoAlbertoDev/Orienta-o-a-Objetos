package membros_estaticos;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculator.circunferencia(radius);  // variável que chama um método Estático
        double v = Calculator.volume(radius);          // variável que chama um método Estático

        System.out.printf("Circuferencia = %.2f\n",c);
        System.out.printf("Volume = %.2f\n", v);
        System.out.printf("PI = %.2f\n",Calculator.PI);

        sc.close();

    }

}
