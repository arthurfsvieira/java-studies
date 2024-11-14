package java_curso;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual valor da conta?");
        int minutos = sc.nextInt();
        double conta = 50.0;

        if (minutos > 100) {
            conta = conta + (minutos - 100) * 2.0;
        }

        System.out.printf("O valor da conta é de R$ %.2f%n ", conta);
        sc.close();

    }
}
