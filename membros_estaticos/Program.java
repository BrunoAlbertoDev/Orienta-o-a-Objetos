package membros_estaticos;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static final double PI = 3.14159; // está é uma constante

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = circunferencia(radius);  // variável que chama um método Estático
        double v = volume(radius);         // variável que chama um método Estático

        System.out.printf("Circuferencia = %.2f\n",c);
        System.out.printf("Volume = %.2f\n",v);
        System.out.printf("PI = %.2f\n",PI);

        sc.close();

    }

    public static  double circunferencia(double radius){   // este é um método Estático

        return  2.0 * PI * radius;
    }

    public static double volume(double radius){            // este é um método Estático

        return  4.0 * PI * Math.pow(radius,2);
    }
}
