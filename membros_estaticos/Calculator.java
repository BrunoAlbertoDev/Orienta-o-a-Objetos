package membros_estaticos;

public class Calculator {

    public static final double PI = 3.14159; // está é uma constante

    public static double circunferencia(double radius){   // este é um método Estático

        return  2.0 * PI * radius;
    }

    public static double volume(double radius){            // este é um método Estático

        return  4.0 * PI * Math.pow(radius,2);
    }
}
