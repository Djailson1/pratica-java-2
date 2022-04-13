package br.com.java.exercicios.loops_de_repeticoes;

import java.util.Scanner;

/*Crie um programa que leia o sexo e a idade de várias pessoas. O programa vai
perguntar se o usuário quer continuar ou não a cada pessoa. No final, mostre:
a) qual é a maior idade lida
b) quantos homens foram cadastrados
c) qual é a idade da mulher mais jovem
d) qual é a média de idade entre os homens*/

public class repeticoes_21_whileComFlag {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idade, cont = 0,cont1 = 1, cont2 = 1, prox = 1, maiorIdade = 0,somaIdHomens = 0,  qantHo = 0, mulMaisNova = 0, mediaIdHo = 0;
        char sexo, continua;

        while(cont < prox){
            System.out.println("Digite o sexo da " + cont1++ +"° pessoa: (M) (F)");
            sexo = scan.next().charAt(0);

            System.out.println("Digite a idade da " + cont2++ +"° pessoa: ");
            idade = scan.nextInt();

            System.out.println("Você quer continuar? (S) (N)");
            continua = scan.next().charAt(0);

            if(idade > maiorIdade){

                maiorIdade = idade;

            }
            if (sexo == 'F'){
                if ((idade < mulMaisNova) || (mulMaisNova == 0)){

                    mulMaisNova = idade;

                }
            }

            if (sexo == 'M'){

                qantHo = qantHo + 1;

            }
            if (sexo == 'M'){
               somaIdHomens = somaIdHomens + idade;
               mediaIdHo = (somaIdHomens) / qantHo;

            }



            if (continua == 'S'){
                prox++;
            }else if (continua == 'N'){
                break;
            }
            System.out.println("-----------------------------------------");

            cont++;
        }
        System.out.println("A maior idade lida é: " + maiorIdade);
        System.out.println("A quantidade de homens cadastrados é de: " + qantHo);
        System.out.println("A idade da mulher mais jovem é de: " + mulMaisNova);
        System.out.println("A média de idade entre os homens é de: " + mediaIdHo);

    }
}
