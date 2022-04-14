package br.com.java.exercicios.loops_de_repeticoes;

import java.util.Scanner;

/*Desenvolva um algoritmo que leia a idade e o sexo de várias pessoas.
O programa vai perguntar se o usuário quer ou não continuar. No final, mostre:
a) A pessoa mais velha
b) A mulher mais jovem
c) A média de idade do grupo
d) Quantos homens tem mais de 30 anos
e) Quantas mulheres tem menos de 18 anos*/
public class repeticoes_22_whileComFlag {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cont = 0,cont2 = 1, prox = 1, idade, maisVelho = 0 , mulMaisNova = 0, medIdade = 0, somaIdade = 0, hoMaior30 = 0, mulMenor18 = 0, quantPessoas = 0;
        char nome = 0, sexo, continua;
        String nomeVelho = null;

        while(cont < prox){
            System.out.println("Digite o nome da " + cont2++ + "° pessoa:");
            nome = scan.next().charAt(0);

            System.out.println("Digite a idade: ");
            idade = scan.nextInt();

            System.out.println("Digite o sexo: (M) (F)");
            sexo = scan.next().charAt(0);

            System.out.println("Deseja continuar? (S) (N)");
            continua = scan.next().charAt(0);

            quantPessoas = quantPessoas + 1;

            somaIdade = somaIdade + idade;
            medIdade = (somaIdade) / quantPessoas;


            if (idade > maisVelho){

                maisVelho = idade;

            }
            if (sexo == 'F'){

                if ((idade < mulMaisNova)||(mulMaisNova == 0)){

                    mulMaisNova = idade;

                }
            }
            if (sexo == 'F'){
                if ((idade < mulMenor18) || (mulMenor18 == 0)){

                    mulMenor18 = mulMenor18 + 1;

                }
            }
            if (sexo == 'M'){
                if (idade > 30){

                    hoMaior30 = hoMaior30 + 1;

                }
            }


            if(continua == 'S'){

                prox = prox + 1;

            }else if (continua == 'N'){

                break;

            }
            System.out.println("----------------------------------------------------------");


            cont++;
        }
        System.out.println("A pessoa mais velha tem: " + maisVelho + " anos.");
        System.out.println("A mulher mais nova tem: " + mulMaisNova + " anos.");
        System.out.println("A média de idade do grupo é de: " + medIdade + " anos.");
        System.out.println("Quantidade de homens maior que 30 anos de idade: " + hoMaior30);
        System.out.println("Quantidade de mulheres menores de 18 anos de idade: " + mulMenor18);
    }
}
