package Projeto5;

public class Calculadora {

    public int num1;
    public  int num2;

    public  Calculadora(int num1, int num2){

        this.num1 = num1;
        this.num2 = num2;
    }

    public  int Soma(int num1, int num2){

        return num1 + num2;

    }

    public int Subtracao(int num1, int num2){

        return num1 - num2;
    }


    public int Multiplicacao(int num1, int num2){

        return num1 * num2;
    }


    public int Divisao(int num1, int num2){

        return num1 / num2;
    }

    public int Módulo(int num1, int num2){
        return num1 % num2;
    }

    public String toString(){

        return "Soma = "+Soma(num1,num2)
                +"\n"
                +"Subtração = "+ Subtracao(num1,num2)
                +"\n"
                +"Multiplicação = "+Multiplicacao(num1,num2)
                +"\n"
                +"Divisão = "+Divisao(num1,num2)
                +"\n"
                +"Módulo = "+Módulo(num1,num2);
    }
}
