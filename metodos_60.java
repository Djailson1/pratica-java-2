package br.com.java.exercicios.loops_de_repeticoes;

import java.util.Scanner;

/*Crie um programa que tenha uma função SuperSomador(), que vai receber dois
números como parâmetro e depois vai retornar a soma de todos os valores no
intervalo entre os valores recebidos.
Ex:
SuperSomador(1, 6) vai somar 1 + 2 + 3 + 4 + 5 + 6 e vai retornar 21
SuperSomador(15, 19) vai somar 15 + 16 + 17 + 18 + 19 e vai retornar 85*/
public class metodos_60 {

    public static int superSomador(int A, int B){

        int SM, C;

        SM = 0;

        for(C = A; C <= B; C++){

            SM += C;



        }
        return SM;

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int VI = 0, VF = 0, S;

        System.out.println("Digite o primeiro número: ");
        VI = scan.nextInt();

        System.out.println("Digite o segundo número: ");
        VF = scan.nextInt();

        S = superSomador(VI,VF);


        System.out.println("\n A soma entre todos do valores de " + VI + " e " + VF + " é igual a = " + S);

    }
}
