package br.com.java.exercicios.loops_de_repeticoes;

import java.util.Scanner;

/**/
public class procedimentos_52 {


    public static void somador(int A, int B){

        System.out.println(" A soma entre A e B é: " + (A+B));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1, n2;
        System.out.println("Digite o primeiro número: ");
        n1 = scan.nextInt();

        System.out.println("Digite o segundo número: ");
        n2 = scan.nextInt();

        somador(n1,n2);

    }
}
