package br.com.java.exercicios.loops_de_repeticoes;

import java.util.Scanner;

/*Crie um programa usando a estrutura “faça enquanto” que leia vários números.
A cada laço, pergunte se o usuário quer continuar ou não. No final, mostre na
tela:
a) O somatório entre todos os valores
b) Qual foi o menor valor digitado
c) A média entre todos os valores
d) Quantos valores são pares*/
public class repeticoes_25_do_while {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero, contaNum = 0, somaNum = 0, menorValor = 0, mediaVal = 0, valPares = 0, prox = 1, cont = 0, cont2 = 1;
        char continua;

        do{
            System.out.println("Digite o " + cont2 ++ + "° número: ");
            numero = scan.nextInt();

            System.out.println("Você quer continuar? [S] ou [N]");
            continua = scan.next().charAt(0);

            contaNum = contaNum + 1;
            somaNum = somaNum + numero;
            mediaVal = (somaNum) / contaNum;

            if ((numero < menorValor)||(menorValor == 0)){
                menorValor = numero;
            }
            
            if (numero % 2 == 0){

                valPares = valPares + 1;

            }



            if (continua == 'S'){
                prox++;
            }else if (continua == 'N'){
                break;
            }
            System.out.println("------------------------------------");
            cont++;
        }while(cont < prox);

        System.out.println("A soma de todos números é: " + somaNum);
        System.out.println("O menor valor digitado foi: " + menorValor);
        System.out.println("A média entre todos os valores é: " + mediaVal);
        System.out.println("Quantidade de números pares: " + valPares);
    }
}
