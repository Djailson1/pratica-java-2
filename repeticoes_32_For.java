package br.com.java.exercicios.loops_de_repeticoes;
/*Faça um programa que mostre os 10 primeiros elementos da Sequência
de Fibonacci:
1 1 2 3 5 8 13 21...*/
public class repeticoes_32_For {
    public static void main(String[] args) {

        int E1, E2, E3, C;

        E1 = 1;
        System.out.println(E1);

        E2 = 1;
        System.out.println(E2);

        for (C = 3; C <= 10; C++){

            E3 = E1 + E2;
            System.out.println(E3);
            E1 = E2;
            E2 = E3;

        }

    }
}
