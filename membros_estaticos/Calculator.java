package membros_estaticos;

public class Calculator {

    public final double PI = 3.14159; // está é uma constante

    public  double circunferencia(double radius){   // este é um método Estático

        return  2.0 * PI * radius;
    }

    public  double volume(double radius){            // este é um método Estático

        return  4.0 * PI * Math.pow(radius,2);
    }
}
