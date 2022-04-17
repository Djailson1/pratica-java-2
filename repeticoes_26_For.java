package br.com.java.exercicios.loops_de_repeticoes;

/*Desenvolva um programa usando a estrutura “para” que mostre na tela a
seguinte contagem:
0 5 10 15 20 25 30 35 40 Acabou!*/
public class repeticoes_26_For {
    public static void main(String[] args) {

        int num, i;

        for (i = 0; i <= 40; i++){

            if (i % 5 == 0){

              System.out.print(i + " ");

          }

        }
        System.out.print("Acabou!");
    }
}
