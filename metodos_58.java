package br.com.java.exercicios.loops_de_repeticoes;
import java.util.Scanner;

/*Crie um programa que tenha uma função Media(), que vai receber as 2 notas de
um aluno e retornar a sua média para o programa principal.*/


public class metodos_58 {
    public static double media(double A, double B){

        return (A + B) / 2;


    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double n1, n2, m;

        System.out.println("Digite a primeira nota do aluno: ");
        n1 = scan.nextDouble();

        System.out.println("Digite a segunda nota do aluno: ");
        n2 = scan.nextDouble();

        m = media(n1,n1);

        System.out.println(" A média do aluno foi: " + m);

    }
}
