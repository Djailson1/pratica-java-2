package br.com.java.exercicios.loops_de_repeticoes;

import java.util.Scanner;

/*Faça um algoritmo que leia o nome, o sexo e o salário de 5 funcionários e
guarde esses dados em três vetores. No final, mostre uma listagem contendo
apenas os dados das funcionárias mulheres que ganham mais de R$5 mil.*/
public class repeticoes_47_Vetores {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[] nome = new char[5];
        char[] sexo = new char[5];
        char[] nomMulher = new char[5];
        double[] salario = new double[5];
        double[] mulher5K = new double[5];

        int C;
        double salar;
        char N,S;

        for (C = 0; C < 5; C++){

            System.out.println("Digite o nome do " + (C+1) + "° funcionário:  ");
            N = scan.next().charAt(0);
            nome[C] = N;

            System.out.println("Digite o sexo do " + (C+1) + "° funcionário: [M/F] ");
            S = scan.next().charAt(0);
            sexo[C] = S;

            System.out.println("Digite o salário do " + (C+1) + "° funcionário: ");
            salar = scan.nextDouble();
            salario[C] = salar;

            if((sexo[C] == 'F') && (salario[C] > 5000)){
                mulher5K[C] = salario[C];
                nomMulher[C] = nome[C];
            }

        }
        for(C = 0; C < 5; C++){
            if (mulher5K[C] > 0){
                System.out.println("Nome: " + nomMulher[C] + "Salário: R$" + mulher5K[C]);
            }
        }


    }
}
