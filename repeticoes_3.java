package br.com.java.exercicios;

/*Crie um aplicativo que mostre na tela a seguinte contagem:
0 3 6 9 12 15 18 Acabou!
*/
public class repeticoes_3 {
    public static void main(String[] args) {
        int num;

        for (num = 0; num <= 18; num++) {
            if (num % 3 == 0) {
                System.out.println(num);
            }


        }
        System.out.println("Acabou!!");
    }
}
