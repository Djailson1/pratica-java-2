package br.com.java.exercicios.loops_de_repeticoes;

import java.util.Scanner;

/*Faça um algoritmo que leia a nota de 10 alunos de uma turma e guarde-as em
um vetor. No final, mostre:
a) Qual é a média da turma
b) Quantos alunos estão acima da média da turma
c) Qual foi a maior nota digitada
d) Em que posições a maior nota aparece*/
public class repeticoes_44_Vetores {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] vetor = new double[10];
        double nota, totalNotas = 0, media, acimaMed, maiorNota = 0;
        int C, alunoAc = 0, posicao = 0;
        
        for(C = 0; C < 10; C++){
            System.out.println("Digite a nota do " + (C+1) + "° aluno: ");
            nota = scan.nextDouble();
            
            vetor[C] = nota;
            totalNotas = totalNotas + nota;
            if (vetor[C] >  maiorNota){
                maiorNota = vetor[C];
                posicao = C;
            }
            
        }
        media = (totalNotas) / 10;
        
        for (C = 0; C < 10; C++){
            acimaMed = vetor[C];
            if(acimaMed > media){
                alunoAc = alunoAc + 1;
            }
        }
        System.out.println("A média da turma é igual a: " + media);
        System.out.println("Quantidade de alunos acima da média da turma: " + alunoAc);
        System.out.println("Maior nota digitada foi: " + maiorNota);
        System.out.println("A maior nota aparece na posição: " + posicao);
        

    }
}
