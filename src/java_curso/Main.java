package java_curso;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual dia da semana?");
        String dia = sc.nextLine();

        switch(dia){
            case "Segunda":
                System.out.println("Segunda feira de novo? Todo semana isso? Fogo.");
                break;
            case "Sexta":
                System.out.println("Hoje é dia de farra, pinga e foguete!");
                break;
            default:
                System.out.println("Dia comum. Tudo ok por aqui.");
                break;
        }

        sc.close();

    }
}
