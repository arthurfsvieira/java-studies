package java_curso;

//public -> Acessível em todo o projeto.
// default -> Padrão quando não definimos nada.
// private -> Acessível somente dentro da classe em que foi construido.
// protected -> Acessível em todo o pacote.

public class Main {
    public static void main(String[] args){
       Carro carro1 = new Mercedes ();
       Carro carro2 = new Jaguar();

       Humano meuSer = new Humano();

       Carro carroquebrado = null;

       try{
           carroquebrado.acelerar();
       } catch (NullPointerException exception){
           System.out.println("Desfazer do veículo.");
       }

    }

}



//Next steps:Learn Modifiers