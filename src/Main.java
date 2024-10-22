public class Main {
    public static void main(String[] args){
        Warrior archer = new Warrior("Garibald", 26);
        archer.Attack();
    }

}

class Warrior {
    String name;
    int damage;
    public Warrior(String name, int damage){
        this.name = name;
        this.damage = damage;
    }
    public void Attack(){
        System.out.println(this.name + " is attacking now! Attack caused " + this.damage + " of damage!" );
    }
}