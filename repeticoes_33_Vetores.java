package br.com.java.exercicios.loops_de_repeticoes;
/*Faça um programa que preencha automaticamente um vetor numérico com 8
posições, conforme abaixo:
999 999 999 999 999 999 999 999
0 1 2 3 4 5 6 7*/
public class repeticoes_33_Vetores {
    public static void main(String[] args) {

        int cont;
        int[] vetor  = new int[7];

        for (cont = 0; cont < 7; cont++){

            vetor [cont] = 999;

            System.out.println(vetor[cont]);
        }


    }
}
