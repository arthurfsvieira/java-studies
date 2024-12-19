package java_curso;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//entrada de 3 numeros, criacao de 2 funcoes.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a, b, c);

        showResult(higher);

        sc.close();
    }
//funcao que armazena o resultado da logica
    public static int max(int x,int y,int z) {
        int res;
        if (x > y && x > z){
            res = x;
        } else if (y > z) {
            res = y;
        } else {
            res = z;
        }
        return res;
    }
//funcao que mostra o resultado
    public static void showResult(int value){
        System.out.println("Higher is: " + value);
    }

}
