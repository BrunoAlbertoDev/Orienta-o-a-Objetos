package Projeto3;

import java.util.Locale;
import java.util.Scanner;

public class AplicationEmployes {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross Salary: R$ ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println(employee.toString());

        System.out.println("Which percentage to increase salary? ");
        double percentage =sc.nextDouble();
        employee.IncreasSalary(percentage);

        System.out.println("Updated data: "+employee);
    }
}
