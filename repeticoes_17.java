package br.com.java.exercicios.loops_de_repeticoes;

import java.util.Random;
import java.util.Scanner;

/*[DESAFIO] Vamos melhorar o jogo que fizemos no exercício 32. A partir de
agora, o computador vai sortear um número entre 1 e 10 e o jogador vai ter 4
tentativas para tentar acertar.*/
public class repeticoes_17 {
    public static void main(String[] args) {
        Random sort = new Random();
        Scanner scan = new Scanner(System.in);

        int numero, numUsuario, cont = 1;


        while (cont <= 4) {
            numero = sort.nextInt(10);
            if (numero == 0) {
                numero = 1;
            }


                System.out.println("Digite um número de 1 a 10 para acertar. Você tem 4 tentativas. Boa Sorte!!");
                System.out.println(cont + "° tentativa");
                numUsuario = scan.nextInt();

                if (numUsuario == numero) {

                    System.out.println("Você acertou!!");
                    System.out.println("O número sorteado foi: " + numero);
                    break;

                } else {

                    System.out.println("Que pena não foi dessa vez.");
                    System.out.println(" O número sorteado foi: " + numero);

                }


                cont++;
            }
        }
    }
