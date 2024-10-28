package java_curso;

public abstract class SerVivo {
    public int age;

    public SerVivo(int age){
        this.age = age;
    }
    public abstract void respirar();


    public void dormir(){
        System.out.println("Dormindo...");
    }
}
