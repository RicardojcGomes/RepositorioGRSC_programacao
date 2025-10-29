package FichaPratica01;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        //import do scanner
        Scanner input = new Scanner(System.in);

        //Decalrar variavies
        double numero1, numero2, numero3, soma,mediaAritmetica, mediaponderada;

        //Ler numero
        System.out.print("Insira o valor: ");
        numero1 = input.nextDouble();

        System.out.print("Insira o valor: ");
        numero2 = input.nextDouble();

        System.out.print("Insira o valor: ");
        numero3 = input.nextDouble();

        //soma
        soma = numero1 + numero2 + numero3;
        System.out.println("Resultado dos valores:" + soma);

        //media aritmetica
        mediaAritmetica = soma/3;
        System.out.println("Media aritmética: " + mediaAritmetica);

        //media ponderada
        mediaponderada =







    }
}
