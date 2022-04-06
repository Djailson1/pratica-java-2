package br.com.java.exercicios.loops_de_repeticoes;

import java.util.Random;

/*Desenvolva um programa que faça o sorteio de 20 números entre 0 e 10 e
mostre na tela:
a) Quais foram os números sorteados
b) Quantos números estão acima de 5
c) Quantos números são divisíveis por 3*/
public class repeticoes_12 {
    public static void main(String[] args) {
        Random sort = new Random();

        int num, cont_num = 1, qtd_acima_de_5 = 0, qtd_divisiveis_por_3  = 0;


        while(cont_num <= 20) {

            num = sort.nextInt(10);
            System.out.print(num + " ");


            if( num > 5){
                qtd_acima_de_5++;
            }
            if (num % 3 == 0){
                qtd_divisiveis_por_3++;
            }

            cont_num++;

        }
        System.out.println("\n\n A quantidade de números maior que 5: " + qtd_acima_de_5);
        System.out.println("\n A quantidade de números divisíveis por 3: " + qtd_divisiveis_por_3);


    }
}
