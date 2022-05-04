package br.com.java.exercicios.loops_de_repeticoes;

import java.util.Scanner;

/*Faça um programa que tenha um procedimento chamado Contador() que recebe
três valores como parâmetro: o início, o fim e o incremento de uma contagem. O
programa principal deve solicitar a digitação desses valores e passá-los ao
procedimento, que vai mostrar a contagem na tela.*/
public class procedimento_55 {
    public static void contadorFor(int i, int f, int p){
        int cont;

        if (p == 0){
           p = 1;
       }
        System.out.println("contagem de " + i + " até " + f + " de " + p + " em " + p);
        if (i < f) {
            cont = i;
            while (cont <= f) {
                System.out.print(cont + " ");
                cont += p;

            }

        }
            if(i > f){
                cont = i;


            while(cont >= f) {


                System.out.print(cont + " ");
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
