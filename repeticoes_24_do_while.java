package br.com.java.exercicios.loops_de_repeticoes;

import java.util.Scanner;

/*Faça um programa usando a estrutura “faça enquanto” que leia a idade de
várias pessoas. A cada laço, você deverá perguntar para o usuário se ele quer ou
não continuar a digitar dados. No final, quando o usuário decidir parar, mostre
na tela:
a) Quantas idades foram digitadas
b) Qual é a média entre as idades digitadas
c) Quantas pessoas tem 21 anos ou mais.*/
public class repeticoes_24_do_while {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idade, totalId = 0, somaId = 0, mediaId = 0, maior21Anos = 0,cont = 0,cont2 = 1, prox = 1;
        char continua;

        do{
            System.out.println("Digite a idade da " + cont2++ +"° pessoa: ");
            idade =  scan.nextInt();

            System.out.println("Quer continuar? [S]/[N]");
            continua = scan.next().charAt(0);

            totalId = totalId + 1;

            somaId = somaId + idade;
            mediaId = (somaId) / totalId;

            if (idade >= 21){

                maior21Anos = maior21Anos + 1;

            }


            if (continua == 'S'){

                prox++;
            }else if (continua == 'N'){
                break;
            }
            System.out.println("-----------------------------------------------");

            cont++;
        }while (cont < prox);

        System.out.println("Quantidade de idades digitadas: " + totalId);
        System.out.println("A média de idade é: " + mediaId + " anos.");
        System.out.println("Quantidade de pessoas que tem 21 anos ou mais: " + maior21Anos + " pessoas.");


    }
}
