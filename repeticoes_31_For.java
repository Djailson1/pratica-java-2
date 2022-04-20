package br.com.java.exercicios.loops_de_repeticoes;

import java.util.Scanner;

/*Desenvolva um programa que leia o primeiro termo e a razão de uma
PA (Progressão Aritmética), mostrando na tela os 10 primeiros elementos da PA e
a soma entre todos os valores da sequência.*/
public class repeticoes_31_For {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int C, T1, T2, T3, R, Soma = 0, SomaTot;

        System.out.println("Digite o primeiro termo da PA: ");
        T1 = scan.nextInt();

        System.out.println("Agora digite a razão da P.A: ");
        R = scan.nextInt();

        System.out.println(T1);

        T2 = T1 + R;

        System.out.println(T2);

        T3 = T2;

        for (C = 3; C <= 10; C++){

            T3 = T3 + R;
            Soma = Soma + T3;
            System.out.println(T3);

        }
        SomaTot = Soma + T2 + T1;
        System.out.println(" A soma entre todos os elementos da P.A é " + SomaTot );

    }
}
