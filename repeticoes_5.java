package br.com.java.exercicios;

import java.util.Scanner;

/*Faça um algoritmo que pergunte ao usuário um número inteiro e positivo
qualquer e mostre uma contagem até esse valor:
Ex: Digite um valor: 35
Contagem: 1 2 3 4 5 6 7 ... 33 34 35 Acabou!*/
public class repeticoes_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int num, numUsuario;

        System.out.println("Digite um número: ");
        numUsuario = scan.nextInt();

        for (num = 1; num <= numUsuario; num++) {

            System.out.println(num);

        }
        System.out.println("Acabou!! ");


    }
}
