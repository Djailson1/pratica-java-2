package br.com.java.exercicios.loops_de_repeticoes;
/*Desenvolva um programa usando a estrutura “para” que mostre na tela a
seguinte contagem:
100 90 80 70 60 50 40 30 20 10 0 Acabou!*/
public class repeticoes_27_For {
    public static void main(String[] args) {

        int i;

        for (i = 100; i >= 0; i--){

            if (i % 10 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.print("Acabou!");
    }
}
