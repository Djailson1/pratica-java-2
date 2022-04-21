package br.com.java.exercicios.loops_de_repeticoes;
/*Crie um programa que preencha automaticamente (usando lógica, não apenas
atribuindo diretamente) um vetor numérico com 10 posições, conforme abaixo:
5 10 15 20 25 30 35 40 45 50
0 1 2 3 4 5 6 7 8 9*/
public class repeticoes_34_Vetores {
    public static void main(String[] args) {

        int cont, a = 0;// variáveis;

        int[] vetor = new int[10];//vetor tipo inteiro com 10 posições (0 á 9)

        //laço For com 10 posições(0 á 9) importante lembrar que o sinal de < sem o = para as posições do vetor bater de 0 á 9;
        for (cont = 0; cont < 10; cont++){

            a = a + 5;// "a" é uma variável acumuladora que somará de 5 em 5 quando for preenchida em cada posição do vetor.
            vetor[cont] = a;//a váriável "vetor" sendo chamada e entre parenteses foi inserida a variável contadora "cont" com 10 posições que é igual a "a" que vai 5 e implemeta a cada posição do vetor;
            System.out.println(a);//imprime a que é resultado da atribuição acima;


        }

    }
}
