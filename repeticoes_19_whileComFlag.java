package br.com.java.exercicios.loops_de_repeticoes;

import java.util.Scanner;

/*Desenvolva um aplicativo que leia o salário e o sexo de vários funcionários.
No final, mostre o total de salários pagos aos homens e o total pago às
mulheres. O programa vai perguntar ao usuário se ele quer continuar ou não
sempre que ler os dados de um funcionário.*/
public class repeticoes_19_whileComFlag {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cont = 0, prox = 0;
        double salario, totalSalHo = 0, totalSalMul = 0;
        char sexo, continua;

        while(cont == prox){
            System.out.println("Qual é o valor do salário? ");
            salario = scan.nextDouble();

            System.out.println("Qual é o sexo (M) ou (F) ?");
            sexo = scan.next().charAt(0);

            System.out.println("---------------------------------------");

            if (sexo == 'M'){

                totalSalHo = totalSalHo + salario;

            }
            if (sexo == 'F'){

                totalSalMul = totalSalMul + salario;

            }
            System.out.println("Deseja continuar cadastro dos funcionários? [S] [N]");
            continua = scan.next().charAt(0);

            if (continua == 'S'){

                prox = prox + 1;

            }else if (continua == 'N'){

                break;

            }
            
            cont++;
        }
        System.out.println("Total de salário pago aos homens: R$" + totalSalHo + " reais.");
        System.out.println("Total de salário pago as mulheres: R$" + totalSalMul + " reais.");


    }
}
