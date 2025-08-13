package Projeto4;

public class Aluno {

    public  String name;
    public double nota1;
    public double nota2;
    public double nota3;
    public double somaTotal;

    public double SomaNotas(){

        return  nota1+nota2+nota3;
    }

    public void Resto(){

          double resto =  nota1 + nota2 + nota3 - 60;
    }

}
