package java_curso;

//public -> Acessível em todo o projeto.
// default -> Padrão quando não definimos nada.
// private -> Acessível somente dentro da classe em que foi construido.
// protected -> Acessível em todo o pacote.

public class Main {
    public static void main(String[] args){
       Carro carro1 = new Carro ("Fiat", 2005);
       Carro carro2 = new Carro ("BMW", 2002);
       Carro carro3 = new Carro ("Mercedes", 2020);

       carro1.Acelerar();
       carro2.Acelerar();
       carro3.Acelerar();

    }

}



//Next steps:Learn Modifiers