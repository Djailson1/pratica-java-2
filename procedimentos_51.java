package br.com.java.exercicios.loops_de_repeticoes;

import java.util.Scanner;

/*Crie um programa que melhore o procedimento Gerador() da questão anterior
para que o programador possa escolher uma entre três bordas:
+-------=======------+ Borda 1
~~~~~~~~:::::::~~~~~~~ Borda 2
<<<<<<<<------->>>>>>> Borda 3
Ex: Uma chamada válida seria Gerador("Portugol Studio", 3, 2)
~~~~~~~~:::::::~~~~~~~
Portugol Studio
Portugol Studio
Portugol Studio
~~~~~~~~:::::::~~~~~~~*/
public class procedimentos_51 {
    public static void gerador(int X, int Y, int H){
        Scanner scan = new Scanner(System.in);


        int x = 0;
        Y = 3;
        System.out.println("       ESCOLHA UMA BORDA:         ");
        System.out.println(" +-------=======-------+ Borda 1 ");
        System.out.println(" ~~~~~~~~:::::::~~~~~~~~ Borda 2 ");
        System.out.println(" <<<<<<<<------->>>>>>>> Borda 3 ");

        H = scan.nextInt();
        switch (H){
            case 1:
                System.out.println(" +-------=======-------+");
                while (X < Y){
                    System.out.println("          Java         ");
                    X++;

                }
                System.out.println(" +-------=======-------+");

                break;

            case 2:
                System.out.println(" ~~~~~~~~:::::::~~~~~~~~");
                while (X < Y){
                    System.out.println("          Java         ");
                    X++;

                }
                System.out.println(" ~~~~~~~~:::::::~~~~~~~~");

                break;

            case 3:
                System.out.println(" <<<<<<<<------->>>>>>>>");
                while (X < Y){
                    System.out.println("          Java         ");
                    X++;

                }
                System.out.println(" <<<<<<<<------->>>>>>>>");

                break;

            default:
                System.out.println("Insira um número válido!!");
                break;

        }



        while (X < Y){
            System.out.println("         Java         ");
            X++;

        }



    }

    public static void main(String[] args) {
        int X = 0,Y = 0, H = 0;
       
        gerador(X,Y,H);


    }
}
