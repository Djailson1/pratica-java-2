package br.com.java.exercicios.loops_de_repeticoes;

import java.util.Scanner;

/*Refaça o exercício 91, só que agora em forma de função Maior(), mas faça uma
adaptação que vai receber TRÊS números como parâmetro e vai retornar qual foi o
maior entre eles.*/
public class metodos_59 {
    public static int maior(int A, int B, int C){
        int M = 0;
        if((A > B) && (A > C)) {
            return A;
        }
        else if ((B > A) && (B > C)) {
            return B;
        }
        else if ((C > A) && (C > B)) {
            return C;
        }
        return M;


    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int v1, v2, v3, M;

        System.out.println("Digite o primeiro valor: ");
        v1 = scan.nextInt();

        System.out.println("Digite o segundo valor: ");
        v2 = scan.nextInt();

        System.out.println("Digite o terceiro valor: ");
        v3 = scan.nextInt();

        M = maior(v1,v2, v3);

        System.out.println("O maior valor digitado foi: " + M);

    }

}
