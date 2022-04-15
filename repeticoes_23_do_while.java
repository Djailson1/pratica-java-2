package br.com.java.exercicios.loops_de_repeticoes;

/*Crie um programa que mostre na tela a seguinte contagem, usando a estrutura
“faça enquanto”(do-while)
0 3 6 9 12 15 18 21 24 27 30 Acabou!*/
public class repeticoes_23_do_while {
    public static void main(String[] args) {

        int num, cont = 0;

        do{

            if (cont % 3 == 0)

            System.out.println(cont);
            cont++;
        }while(cont <= 30);

        System.out.println("Acabou!!");

    }

}

