package br.com.java.exercicios.loops_de_repeticoes;

import java.util.Scanner;

/*Faça um programa que tenha um procedimento chamado Contador() que recebe
três valores como parâmetro: o início, o fim e o incremento de uma contagem. O
programa principal deve solicitar a digitação desses valores e passá-los ao
procedimento, que vai mostrar a contagem na tela.

Ex: Para os valores de início (4), fim (20) e incremento(3) teremos
Contador(4, 20, 3) vai mostrar na tela 4 >> 7 >> 10 >> 13 >> 16 >> 19 >> FIM*/

public class procedimento_55 {
    public static void contadorFor(int i, int f, int p){
        int cont;
        System.out.println("contagem de " + i + " até " + f + " de " + p + " em " + p);

        if (p == 0){
           p = 1;
       }

        if (i < f){
            cont = i;
            if (cont == 1){
                cont = p;
            }
            while (cont <= f) {
                System.out.print(cont + " >> ");
                cont += p;

            }

        }
            if(i > f){
                cont = i;


            while(cont >= f) {


                System.out.print(cont + " >> ");
                cont -= p;


            }
        }

        System.out.println("Fim!");





    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int ini, fim, pas;

        System.out.println("Digite o valor inicial: ");
        ini = scan.nextInt();

        System.out.println("Digite o valor final: ");
        fim = scan.nextInt();

        System.out.println("Digite o incremento: ");
        pas = scan.nextInt();

        contadorFor(ini,fim,pas);




    }
}
