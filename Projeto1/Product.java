package Projeto1;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public double TotalValueInStock(){
        return price * quantity;
    }
    public void ADDStock(int quantity){

        this.quantity+=quantity;
    }

    public void RemoveStock(int quantity){

        this.quantity-=quantity;
    }
    
    public void Meucarrinho(String nome, int quantidade){

         name = name;
         quantity = quantity;
    }

    public String toString(){

        return "Name: "+name
                +", "
                +"Price: "+String.format("R$ %.2f",price)
                +", "
                +"Quantity: " + quantity+" units"
                +", "
                +"Total: "+String.format("R$ %.2f",TotalValueInStock());
    }

    public String toString2(){

        return "====== Meu Carrinho ======"
                +"\n"
                +"produto: "+name
                +"\n"
                +"Quantidade: "+quantity +" unidades"
                +"\n"
                +"Total a Pagar: "+String.format("R$ %.2f",TotalValueInStock());


    }
}
