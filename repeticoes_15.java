package br.com.java.exercicios.loops_de_repeticoes;

import java.util.Scanner;

/*Faça um programa que leia a idade e o sexo de 5 pessoas, mostrando no final:
a) Quantos homens foram cadastrados
b) Quantas mulheres foram cadastradas
c) A média de idade do grupo
d) A média de idade dos homens
e) Quantas mulheres tem mais de 20 anos*/
public class repeticoes_15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cont = 1, idade = 0, qtdHo = 0, qtdMul = 0, idMediaGruSoma = 0,medIdHoSoma = 0, mediaIdHom = 0, mulMaior20 = 0, mediaIdadeGrupo = 0 ;

        char sexo, nome;

        while(cont <= 5){

            System.out.println("Digite seu nome: ");
            nome = scan.next().charAt(0);

            System.out.println("Digite sua idade: ");
            idade = scan.nextInt();

            System.out.println("Digite seu sexo: [M]/[F] ");
            sexo = scan.next().charAt(0);
            System.out.println("-------------------------------------------------------");

            idMediaGruSoma = idMediaGruSoma + idade;
            mediaIdadeGrupo = (idMediaGruSoma)/ 5;
            //idade média grupo


            if(sexo == 'M'){

                qtdHo = qtdHo + 1;

            }else if(sexo == 'F'){

                qtdMul = qtdMul + 1;

            }if(sexo == 'M'){

                medIdHoSoma = medIdHoSoma + idade;
                mediaIdHom = (medIdHoSoma)/5;
            }if((sexo == 'F') && (idade > 20)){
                mulMaior20 = mulMaior20 + 1;

            } //atribui a quantidade de mulheres com idade maior que 20

            cont++;
        }
        System.out.println("Quantidade de homens cadastrados: " + qtdHo);
        System.out.println("Quantidade de mulheres cadastradas: " + qtdMul);

        System.out.println("A média de idade do grupo é: " + mediaIdadeGrupo);

        System.out.println("A média de idade dos homens é: " + mediaIdHom);

        System.out.println("A quantidade de mulheres maiores de 20 anos é : " + mulMaior20);





    }
}
