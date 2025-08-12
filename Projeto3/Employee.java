package Projeto3;

public class Employee {

    public  String name;
    public double grossSalary;
    public double tax;

    public double NetSalary(){

        return  grossSalary - tax;
    }

    public void IncreasSalary(double percentage){

        grossSalary +=  grossSalary * percentage/100.0;
    }

    public String toString(){
        return "Employee: "+name +", "+ String.format("R$ %.2f",NetSalary());


    }
}
