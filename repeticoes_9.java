package br.com.java.exercicios.loops_de_repeticoes;
/*Desenvolva um aplicativo que mostre na tela o resultado da expressão 500 +
450 + 400 + 350 + 300 + ... + 50 + 0*/
public class repeticoes_9 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");

        int soma = 0;
        int cont = 500;

        while(cont >= 50){
            soma += cont;
            System.out.print(cont + " + ");
            cont -= 50;

        }
        System.out.println(cont + " Soma: " + soma);
    }
}
