package Projeto2;

import java.util.Locale;
import java.util.Scanner;

public class CadastrarLivrosAplication {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Descrição: ");
        String decicao = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        sc.nextLine();
        System.out.print("isbn: ");
        String isbn = sc.nextLine();
        System.out.print("Quantity: ");
        int quantity = sc.nextInt();
        System.out.print("Autor: ");
        sc.nextLine();
        String nameAutor = sc.nextLine();
        System.out.print("Email: ");
        String emailAutor = sc.nextLine();
        Livro livro = new Livro(name, decicao, price, isbn, quantity, nameAutor, emailAutor );
        Autor autor = new Autor(nameAutor,emailAutor);



        System.out.println("====== Dados do 1º Livro ======");
        System.out.println(livro.toString());
        System.out.println(autor.toString());

        System.out.print("\nRemove book from stock? ");
        int removeStock = sc.nextInt();
        livro.RemoveFromStock(removeStock);

        System.out.println("====== Update do 1º Book ======");
        System.out.println(livro);
        System.out.println(autor);
    }
}
