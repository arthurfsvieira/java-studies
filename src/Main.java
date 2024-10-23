public class Main {
    public static void main(String[] args){
        Warrior archer = new Warrior("Garibald", 26);
        Warrior goblin = new Warrior("Baruk", 50);
        archer.Attack();
        goblin.Attack();
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
        if(this.damage > 30){
            System.out.println(this.name + " is attacking now! Attack caused " + this.damage + " of damage! BRUTAL!!!" );
        } else {
            System.out.println(this.name + " is attacking now! Attack caused " + this.damage + " of damage!" );
        }

    }
}