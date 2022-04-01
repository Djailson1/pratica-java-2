package br.com.java.exercicios.loops_de_repeticoes;

/*Crie um programa que calcule e mostre na tela o resultado da soma entre 6 +
8 + 10 + 12 + 14 + ... + 98 + 100.*/
public class repeticoes_8 {
    public static void main(String[] args) {
        int soma = 0;
        int cont = 6;

        while(cont < 100){

            soma += cont;
            System.out.println(cont + "+");
            cont += 1;
        }

        System.out.println(cont + " Soma: " + soma);

    }
}
