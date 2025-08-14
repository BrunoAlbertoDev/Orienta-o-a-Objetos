package Projeto2;

public class Livro {

    public  String name;
    public String decicao;
    public double price;
    public String isbn;
    public int quantity;
    public Autor autor;


    public Livro(String name, String descricao, double price, String isbn, int quantity, String nameAutor, String emailAutor){

        this.name = name;
        this.decicao = descricao;
        this.price = price;
        this.isbn = isbn;
        this.quantity = quantity;

    }


    public void ADDLivro(int quantity){

        this.quantity+=quantity;

    }

    public double TotalValue(){
        return price * quantity;
    }

    public void RemoveFromStock(int quantity){

        this.quantity -= quantity;

    }

    public String toString(){

        return "Nome: "+name
                +"\n"
                +"Descrição: " + decicao
                +"\n"
                +"Preço: " +String.format("R$ %.2f",price)
                +"\n"
                +"isbn: "+isbn
                +"\n"
                +"Quantidade: "+quantity+ " units"
                +"\n"
                +"Total: "+String.format("R$ %.2f",TotalValue());

    }
}
