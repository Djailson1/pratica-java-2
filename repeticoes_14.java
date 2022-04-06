package br.com.java.exercicios.loops_de_repeticoes;

import java.util.Scanner;

/*Crie um algoritmo que leia a idade de 10 pessoas, mostrando no final:
a) Qual é a média de idade do grupo
b) Quantas pessoas tem mais de 18 anos
c) Quantas pessoas tem menos de 5 anos
d) Qual foi a maior idade lida*/
public class repeticoes_14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idade, maior18 = 0, menor5 = 0, maiorIdade = 0, cont = 0, num = 1;
        double media = 0, somaMedia = 0;

        for (cont = 0; cont < 10; cont++){

            System.out.println("Digite a idade da " + num++ + "° pessoa: ");
            idade = scan.nextInt();

            somaMedia = somaMedia + idade;
            media = (somaMedia) / 10;

            if(idade > 18){

              maior18 = maior18 + 1;

            }
            if (idade < 5){
                menor5 = menor5 + 1;
            }
            if (idade > maiorIdade){
                maiorIdade = idade;
            }

        }
        System.out.println("A média de idade é de: " + media);
        System.out.println("O número de pessoas com mais de 18 anos é de: " + maior18 + " pessoas.");
        System.out.println("O número de pessoas com menos de 5 anos é de: " + menor5 + " pessoas.");
        System.out.println("A maior idade foi de: " + maiorIdade + " anos.");

    }
}
