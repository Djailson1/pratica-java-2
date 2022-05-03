package br.com.java.exercicios.loops_de_repeticoes;

import java.util.Scanner;

/*Desenvolva um algoritmo que leia dois valores pelo teclado e passe esses
valores para um procedimento Maior() que vai verificar qual deles é o maior e
mostrá-lo na tela. Caso os dois valores sejam iguais, mostrar uma mensagem
informando essa característica.*/
public class procedimentos_53 {
    public static void maior(int A, int B){

        if (A > B){
            System.out.println(A + " (A) é maior que (B) " + B);
        }
        if (B > A){
            System.out.println(B + " (B) é maior que (A) " + A);
        }
        if (A == B){
            System.out.println(A + " e " + B + " são iguais!");
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1, n2;

        System.out.println("Digite o primeiro valor: ");
        n1 = scan.nextInt();

        System.out.println("Digite o segundo valor: ");
        n2 = scan.nextInt();

        maior(n1,n2);

    }
}
