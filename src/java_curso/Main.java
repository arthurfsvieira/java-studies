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

class Carro {

    String modelo;
    int ano;

    public Carro (String modelo, int ano){
        this.modelo = modelo;
        this.ano = ano;
    }

    public void Acelerar(){
        if(this.ano >= 2020) {
            System.out.println("Você está acelerando o modelo " + this.modelo + ", ano " + this.ano + ". Este é o modelo mais recente!");
        } else {
            System.out.println("Você está acelerando o modelo " + this.modelo + ", ano " + this.ano);
        }
    }
}

//Next steps:Learn Modifiers