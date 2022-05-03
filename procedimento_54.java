package br.com.java.exercicios.loops_de_repeticoes;

import java.util.Scanner;

/*Crie uma lógica que leia um número inteiro e passe para um procedimento
ParOuImpar() que vai verificar e mostrar na tela se o valor passado como
parâmetro é PAR ou ÍMPAR.*/
public class procedimento_54 {
    public static void parImpar(int A){

        if (A % 2 == 0){
            System.out.println("È par!!");
        }else{
            System.out.println("È impar");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int v1;

        System.out.println("Insira um valor: ");
        v1 = scan.nextInt();

        parImpar(v1);
    }
}
