package Projeto2;

public class Autor {

    public String name;
    public String email;

    @Override
    public String toString() {
        return "Autor do Livro"
                +"\n"
                +"name: "+name
                +"\n"
                +"E-mail: "+ email;

    }
}
