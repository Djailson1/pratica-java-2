package br.com.java.exercicios;

/*Desenvolva um programa que mostre na tela a seguinte contagem:
100 95 90 85 80 ... 0 Acabou!*/
public class repeticoes_4 {
    public static void main(String[] args) {
        int num;

        for (num = 100; num >= 0; num--) {
            if (num % 5 == 0) {
                System.out.println(num);
            }


        }
        System.out.println("Acabou!!");
    }
}
