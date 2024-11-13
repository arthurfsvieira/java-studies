package java_curso;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual código do produto?");
        int codigo = sc.nextInt();
        System.out.println("Qual a quantidade?");
        int quantidade = sc.nextInt();

        double total;

        if (codigo == 1) {
            total = quantidade * 4.0;
        } else if (codigo == 2) {
            total = quantidade * 4.50;
        } else if (codigo == 3) {
            total = quantidade * 5.0;
        } else if (codigo == 4) {
            total = quantidade * 2.0;
        } else {
            total = quantidade * 1.5;
        }

        System.out.printf("Total: R$ %.2f%n", total);

        sc.close();

    }
}

