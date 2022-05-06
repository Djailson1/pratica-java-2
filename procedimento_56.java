package br.com.java.exercicios.loops_de_repeticoes;
/*[DESAFIO] Desenvolva um aplicativo que tenha um procedimento chamado
Fibonacci() que recebe um único valor inteiro como parâmetro, indicando quantos
termos da sequência serão mostrados na tela. O seu procedimento deve receber
esse valor e mostrar a quantidade de elementos solicitados.
Obs: Use os exercícios 70 e 75 para te ajudar na solução
Ex:
Fibonacci(5) vai gerar 1 >> 1 >> 2 >> 3 >> 5 >> FIM
Fibonacci(9) vai gerar 1 >> 1 >> 2 >> 3 >> 5 >> 8 >> 13 >> 21 >> 34 >> FIM*/

import java.util.Scanner;

public class procedimento_56 {
    public static void fibonacci(int x){
        int cont, n1, n2, n3;
        n1 = 1;
        System.out.println(n1 + " >> ");

        n2 = 1;
        System.out.println(n2 + " >> ");

        for(cont = 3; cont <= x; cont++ ){
            n3 = n1 + n2;
            System.out.println(n3 + " >> ");

            n1 = n2;
            n2 = n3;

        }
        System.out.println("Fim!");

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0;

        System.out.println("Digite quantos termos da sequência serão mostrados: ");
        n = scan.nextInt();

        fibonacci(n);


    }
}
