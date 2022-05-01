package br.com.java.exercicios.loops_de_repeticoes;



/*Crie um programa que melhore o procedimento Gerador() da questão anterior
para que mostre uma mensagem vário
Ex: Ao chamar Gerador("Aprendendo Portugol", 4) aparece:
+-------=======------+
Aprendendo Portugol
Aprendendo Portugol
Aprendendo Portugol
Aprendendo Portugol
+-------=======------+*/
public class procedimentos_50 {

    public static void gerador(int A, int B){
        int X = 0;
        int Y = 4;

        while(X < Y){

            System.out.println("      Aprendendo Java      ");
            X++;
        }


    }
    public static void main(String[] args) {
        int X = 0;
        int Y = 4;

        System.out.println("+------===========-------+");
        gerador(X,Y);
        System.out.println("+------===========-------+");



    }
}
