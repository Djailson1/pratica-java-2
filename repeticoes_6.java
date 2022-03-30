package br.com.java.exercicios;
/*Desenvolva um algoritmo que mostre uma contagem regressiva de 30 até 1,
marcando os números que forem divisíveis por 4, exatamente como mostrado abaixo:
30 29 [28] 27 26 25 [24] 23 22 21 [20] 19 18 17 [16]...*/
public class repeticoes_6 {
    public static void main(String[] args) {
        int num;

        for (num = 30; num >= 1; num--) {
            if (num % 4 == 0) {
                System.out.println("[" + num + "]");
            } else {
                System.out.println(num);
            }

        }
    }
}
