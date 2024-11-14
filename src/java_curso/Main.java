package java_curso;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual horário começou?");
        int inicio = sc.nextInt();
        System.out.println("Qual horário terminou?");
        int fim = sc.nextInt();

        int duracao;

        if (inicio < fim) {
            duracao = fim - inicio;
        } else {
            duracao = 24 - inicio + fim;
        }

        System.out.printf("O jogo durou " + duracao + " horas.");

        sc.close();

    }
}
