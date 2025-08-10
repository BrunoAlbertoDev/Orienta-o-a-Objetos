package Projeto1;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Aplication {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Enter Product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity: ");
        product.quantity = sc.nextInt();

        System.out.println("\nproduct data: : "+product);

        System.out.print("\n\nEnter product number ADD Stock: ");
        int ADDStock = sc.nextInt();
        product.ADDStock(ADDStock);

        System.out.println("\nUpdated product: "+product);

        System.out.print("\n\nEnter Product Remove from stock: ");
        int removeStock = sc.nextInt();
        product.RemoveStock(removeStock);

        System.out.print("\nUpdated Final: "+product);


    }
}
