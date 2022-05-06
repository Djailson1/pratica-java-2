package br.com.java.exercicios.loops_de_repeticoes;

import java.util.Scanner;

/*Faça um programa que possua uma função chamada Potencia(), que vai receber
dois parâmetros numéricos (base e expoente) e vai calcular o resultado da
exponenciação.
Ex: Potencia(5,2) vai calcular 52 = 25*/
public class metodos_61 {

    public static double potencia(double N, double P){
        if(P == 0){
           return 1;
        }else{
          return N * potencia(N, P - 1);
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double base = 0, expo = 0, resp;

        System.out.println("Digite o valor da Base: ");
        base = scan.nextDouble();

        System.out.println("Digite o valor do Expoente:");
        expo = scan.nextDouble();

        resp = potencia(base, expo);


        System.out.println("A potência de " + base + " elevado a " + expo + " é igual a " + resp);

    }
}
