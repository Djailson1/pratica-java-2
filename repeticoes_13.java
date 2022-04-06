package br.com.java.exercicios.loops_de_repeticoes;

import java.util.Scanner;

/*Faça um aplicativo que leia o preço de 8 produtos. No final, mostre na tela
qual foi o maior e qual foi o menor preço digitados.*/
public class repeticoes_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double valorProduto = 0, maior = 0, menor = 0;
        int cont = 0, num = 1;

        while (cont < 8){
            System.out.println("Digite o valor do " + num++ +"° produto: ");
            valorProduto = scan.nextDouble();

            if(cont == 0){

                maior = valorProduto;
                menor = valorProduto;

            }
            if (valorProduto > maior){
                maior = valorProduto;
            }
            if (valorProduto < menor){
                menor = valorProduto;
            }
            cont++;

        }
        System.out.println("O maior valor é: " + maior + "O menor valor é: " + menor);



    }
}
