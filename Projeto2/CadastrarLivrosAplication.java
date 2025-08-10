package Projeto2;

import java.util.Locale;
import java.util.Scanner;

public class CadastrarLivrosAplication {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Livro livro = new Livro();



        System.out.print("Name: ");
        livro.name = sc.nextLine();
        System.out.print("Descrição: ");
        livro.decicao = sc.nextLine();
        System.out.print("Price: ");
        livro.price = sc.nextDouble();
        sc.nextLine();
        System.out.print("isbn: ");
        livro.isbn = sc.nextLine();

        System.out.println("====== Dados do 1º Livro ======");
        System.out.println(livro);
    }
}
