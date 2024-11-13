package java_curso;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        int a = sc.nextInt();
        System.out.println("Digite outro número:");
        int b = sc.nextInt();


        if (a % b == 0 || b % a == 0) {
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos.");
        }


        sc.close();

    }
}

