package membros_estaticos.Exercicio;

public class ConversorDolar {

    public static double IOF = 0.06;

    public static double dola_Real(double valoReal,Double dola){
        return valoReal * dola *  (1.0 + IOF);
    }
}
