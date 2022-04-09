package br.com.java.exercicios.loops_de_repeticoes;

import java.util.Scanner;

/*Desenvolva um aplicativo que leia o peso e a altura de 7 pessoas, mostrando
no final:
a) Qual foi a média de altura do grupo
b) Quantas pessoas pesam mais de 90Kg
c) Quantas pessoas que pesam menos de 50Kg tem menos de 1.60m
d) Quantas pessoas que medem mais de 1.90m pesam mais de 100Kg.*/
public class repeticoes_16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double peso = 0, altura, mediaAlturaSoma = 0, mediaAltura = 0, maiorKg90 = 0, menosKg50 = 0, maisKg100 = 0, cont = 1;
        char nome;

        while(cont <= 2){

            System.out.println("Insira o nome: ");
            nome = scan.next().charAt(0);

            System.out.println("Insira o peso: ");
            peso = scan.nextDouble();

            System.out.println("Insira a altura: ");
            altura = scan.nextDouble();

            System.out.println("-------------------------------------------");

            mediaAlturaSoma = mediaAlturaSoma + altura;
            mediaAltura = (mediaAlturaSoma) / 2;

            if(peso > 90 ){

                maiorKg90 = maiorKg90 + 1;

            }
            if ((peso < 50) && (altura < 1.60)){

                menosKg50 = menosKg50 + 1;

            }
            if ((peso > 100) && (altura > 1.90)){

                maisKg100 = maisKg100 + 1;

            }




            cont++;
        }
        System.out.println(" A médio de altura do grupo foi de: " + mediaAltura);
        System.out.println("Quantidade de pessoas que pesam mais que 90 kg: " + maiorKg90);
        System.out.println("Quantidade de pessoas que pesam menos que 50kg e tem menos de 1,60 de altura: " + menosKg50);
        System.out.println("quantidade de pessoas que pesam mais de 100kg e medem mais de 1,90 de altura: " + maisKg100);



    }
}
