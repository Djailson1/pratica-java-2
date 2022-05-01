package br.com.java.exercicios.loops_de_repeticoes;
/*Crie um programa que melhore o procedimento Gerador() da questão anterior
para que mostre uma mensagem personalizada, passada como parâmetro.
Ex: Ao chamar Gerador("Aprendendo Portugol") aparece:
+-------=======------+
Aprendendo Portugol
+-------=======------+*/
public class procedimentos_49 {

    public static void gerador(String C){

        System.out.println("+------===========-------+");
        System.out.println(C);
        System.out.println("+------===========-------+");
    }
    public static void main(String[] args) {
        String C;
        C = "     Aprendendo Java      ";
        gerador(C);
    }
}
