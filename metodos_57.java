package br.com.java.exercicios.loops_de_repeticoes;

import java.util.Scanner;

/*Refaça o exercício 90, só que agora em forma de função Somador(), que vai
receber dois parâmetros e vai retornar o resultado da soma entre eles para o
programa principal.*/
public class metodos_57 {

   public static int somador(int A, int B){

        return A + B;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = 0, n2 = 0, S;
        System.out.println("Digite o primeiro número: ");
        n1 = scan.nextInt();

        System.out.println("Digite o segundo número: ");
        n2 = scan.nextInt();

        S = somador(n1,n2);
        System.out.println(" A soma entre " + n1 + " e " + n2 + " é igual a = " + S);

    }

}
