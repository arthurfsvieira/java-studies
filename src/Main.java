import java.util.ArrayList;

public class Main {

    public static void main (String[] args){
     /*
    //Variables
    int age = 28;
    String name = "Arthur";
    var role = "Software Developer";

    //Primitive types

    //whole number
    byte
    short
    int
    long
    //decimal number
    float
    double (more precise)

    //Words and phrases
    //-String (Phrases and words) - "Jorgin me esmpresta a 12"
    //-char (Single letter) - 'a'

    //Boolean
    //true or false
    */

        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 100000L;
        float f= 10.5f;
        double d = 20.5;
        char c = 'A';
        String str = "";
        boolean bool = true;

        ArrayList<String> names = new ArrayList<>();
        names.add("Arthur");
        names.add("Vampeta");
        names.add("Jussara");

        int[] inteiros = {1,2,3,4,5};

        System.out.println(names);
        System.out.println("O tamanho do arrayList é de: " + (names.size()) + " itens.");
        System.out.println(names.get(1));

        System.out.println("O tamanho do array inteiros é de: " + (inteiros.length) + " itens.");

    }

}

