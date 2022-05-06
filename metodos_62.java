package br.com.java.exercicios.loops_de_repeticoes;

import java.util.Scanner;

/*Melhore o exercício 96, criando além da função Media() uma outra função
chamada Situacao(), que vai retornar para o programa principal se o aluno está
APROVADO, em RECUPERAÇÃO ou REPROVADO. Essa nova função, vai receber como
parâmetro o resultado retornado pela função Media().*/
public class metodos_62 {
    public static double media(double A, double B){

        return (A + B) / 2;


    }


    public static String situacao(double p){
        if(p >= 7) {

            return "APROVADO";

        }else{

            return "REPROVADO";

        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double n1, n2, m;
        String s;

        System.out.println("Digite a primeira nota do aluno: ");
        n1 = scan.nextDouble();

        System.out.println("Digite a segunda nota do aluno: ");
        n2 = scan.nextDouble();

        m = media(n1,n1);
        s = situacao(m);

        System.out.println(" A média do aluno foi: " + m);
        System.out.print(" Com essa nota a situação do aluno está " + s);

    }
}
