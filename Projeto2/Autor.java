package Projeto2;

public class Autor {

    public String name;
    public String email;

    public Autor(String name, String email){

        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Autor do Livro"
                +"\n"
                +"name: "+name
                +"\n"
                +"E-mail: "+ email;

    }
}
