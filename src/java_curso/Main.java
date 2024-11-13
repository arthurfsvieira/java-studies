package java_curso;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número:");
        numero = sc.nextInt();

        if (numero >= 0) {
            System.out.println("Não é negativo.");
        } else {
            System.out.println("É negativo.");
        }


        sc.close();

    }
}

