package Projeto4;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Locale;
import java.util.Scanner;

public class Aplication {

    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        aluno.name = sc.nextLine();
        aluno.nota1 = sc.nextDouble();
        aluno.nota2 = sc.nextDouble();
        aluno.nota3 = sc.nextDouble();


        if (aluno.SomaNotas() >= 60){

            System.out.printf("FINAL GRADE = %.2f\n",aluno.SomaNotas());
            System.out.println("PASS");
        } else{

            System.out.printf("FINAL GRADE = %.2f\n",aluno.SomaNotas());
            System.out.println("FAILED");
            double resto = 60 - aluno.SomaNotas();
            System.out.println("MISSING "+resto+" POINTS");


        }

    }
}
