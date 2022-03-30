package br.com.java.exercicios;

import java.util.Scanner;

/*Crie um algoritmo que leia o valor inicial da contagem, o valor final e o
incremento, mostrando em seguida todos os valores no intervalo:
Ex: Digite o primeiro Valor: 3
Digite o último Valor: 10
Digite o incremento: 2
Contagem: 3 5 7 9 Acabou!

O programa acima vai ter um problema quando digitarmos o primeiro valor
maior que o último. Resolva esse problema com um código que funcione em qualquer
situação.*/
public class repeticoes_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int primeiroValor, ultimoValor, incremento;

        System.out.println("Digite o primeiro valor: ");
        primeiroValor = scan.nextInt();

        System.out.println("Digite o último valor: ");
        ultimoValor = scan.nextInt();

        System.out.println("Digite o incremento: ");
        incremento = scan.nextInt();

        for (primeiroValor = primeiroValor; primeiroValor <= ultimoValor; primeiroValor++){
            if (primeiroValor % incremento == 0)
                System.out.println(primeiroValor);
        }


        for (primeiroValor = primeiroValor; primeiroValor >= ultimoValor; primeiroValor--){
            if (primeiroValor % incremento == 0)
                System.out.println(primeiroValor);
        }
                System.out.println("Acabou!!");


    }
}
