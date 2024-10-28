package java_curso;

public class Humano extends SerVivo{
    public String name;
    public Humano(){
        super(50);
        this.name = "Arthur";
    }

    @Override



    public void respirar() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println("Inalando e exalando.");
    }
}
