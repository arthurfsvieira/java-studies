public class Main {
    public static void main(String[] args){
        Warrior archer = new Warrior("Garibald");
        archer.Attack();
    }

}

class Warrior {
    String name;
    public Warrior(String name){
        this.name = name;
    }
    public void Attack(){
        System.out.println(this.name + " is attacking now!");
    }
}