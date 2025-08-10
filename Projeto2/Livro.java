package Projeto2;

public class Livro {

    public  String name;
    public String decicao;
    public double price;
    public String isbn;

    public String toString(){

        return "Nome: "+name
                +"\n"
                +"Descrição: " + decicao
                +"\n"
                +"Preço: " +String.format("R$ %.2f",price)
                +"\n"
                +"isbn: "+isbn;
    }
}
