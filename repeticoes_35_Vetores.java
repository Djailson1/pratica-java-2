package br.com.java.exercicios.loops_de_repeticoes;
/*Crie um programa que preencha automaticamente (usando lógica, não apenas
atribuindo diretamente) um vetor numérico com 10 posições, conforme abaixo:
9 8 7 6 5 4 3 2 1 0
0 1 2 3 4 5 6 7 8 9*/
public class repeticoes_35_Vetores {
    public static void main(String[] args) {

        int cont;
        int[] vetor = new int[10];

        for(cont = 9; cont >= 0; cont--){

            vetor[cont] = cont;

            System.out.print(cont + " ");


        }

    }
}
