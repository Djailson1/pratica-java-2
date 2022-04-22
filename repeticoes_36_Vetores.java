package br.com.java.exercicios.loops_de_repeticoes;
/*Crie um programa que preencha automaticamente (usando lógica, não apenas
atribuindo diretamente) um vetor numérico com 10 posições, conforme abaixo:
5 3 5 3 5 3 5 3 5 3
0 1 2 3 4 5 6 7 8 9*/
public class repeticoes_36_Vetores {
    public static void main(String[] args) {

        int cont, a, b;

        int[] vetor = new int[10];

        for (cont = 0; cont < 10; cont++){
           if (cont % 2 == 0){

               vetor[cont] = 5;

           }else{

               vetor[cont] = 3;

           }

            System.out.print(vetor[cont] + " ");



        }


    }
}
