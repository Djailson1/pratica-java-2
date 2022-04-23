package br.com.java.exercicios.loops_de_repeticoes;
/*Crie um programa que preencha automaticamente (usando lógica, não apenas
atribuindo diretamente) um vetor numérico com 15 posições com os primeiros
elementos da sequência de Fibonacci:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987
0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15*/
public class repeticoes_37_Vetores {
    public static void main(String[] args) {
        int cont, T1, T2;
        int[] vetor = new int [17];

        T1 = 1;
        T2 = 1;

        vetor[0] = 1;
        System.out.print(vetor[0] + " ");
        vetor[1] = 1;
        System.out.print(vetor[1] + " ");

        for(cont = 2; cont < 16; cont++){

            vetor[cont] = T1 + T2;
            T1 = T2;
            T2 = vetor[cont];
            System.out.print(T2 + " ");
        }

    }
}
