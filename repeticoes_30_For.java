package br.com.java.exercicios.loops_de_repeticoes;

import java.util.Scanner;

/*Crie um programa que leia sexo e peso de 8 pessoas, usando a estrutura
“para”. No final, mostre na tela:
a) Quantas mulheres foram cadastradas
b) Quantos homens pesam mais de 100Kg
c) A média de peso entre as mulheres
d) O maior peso entre os homens*/
public class repeticoes_30_For {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i, cont = 1,cont2 = 1, peso,medPesoMul = 0, mulCad = 0, hoMais100 = 0, somaPesoMul = 0, maiorPesoHom = 0;
        char sexo;

        for (i = 1;i <= 3; i++){
            System.out.println("Digite o sexo da " + cont2++ +"° pessoa: [M] ou [F]");
            sexo = scan.next().charAt(0);

            System.out.println("Digite o peso: ");
            peso = scan.nextInt();

            System.out.println("-------------------------------------------------------");

            if (sexo == 'F'){

                mulCad = mulCad + 1;
               somaPesoMul = somaPesoMul + peso;
                medPesoMul = (somaPesoMul) / mulCad;

            }
            if ((sexo == 'M')&&(peso > 100)){

                hoMais100 = hoMais100 + 1;

            }
            if (sexo == 'M'){
                if ((peso > maiorPesoHom)||(maiorPesoHom == 0)){

                    maiorPesoHom = peso;

                }

            }




        }

        System.out.println("Quantidade de mulheres cadastradas: " + mulCad);
        System.out.println("Quantidade de homens que pesam mais de 100 kg: " + hoMais100);
        System.out.println("A média de peso entre as mulheres é de: " + medPesoMul + " quilos.");
        System.out.println("O maior peso entre os homens é de: " + maiorPesoHom + " quilos.");
    }
}
