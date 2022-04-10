package br.com.java.exercicios.loops_de_repeticoes;

import java.util.Scanner;

/*Crie um programa que leia vários números pelo teclado e mostre no final o
somatório entre eles.
Obs: O programa será interrompido quando o número 1111 for digitado*/
public class repeticoes_18_whileComFlag {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numeroUsuario,somaNumeros = 0, cont = 0;


        while (cont <= 10){
            System.out.println("Digite um número: ");
            numeroUsuario = scan.nextInt();

            somaNumeros =somaNumeros + numeroUsuario;

            if (numeroUsuario == 1111){

                System.out.println("Fim do programa.");
                break;
            }

            if (numeroUsuario == 1111){

                System.out.println("Programa interrompido");

            }else{

                System.out.println("A soma dos números é: " + somaNumeros);

            }
            cont++;

        }


    }
}
