package FichaPratica01;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        //import do scanner
        Scanner input = new Scanner(System.in);

        //Decalrar variavies
        double nota1, nota2, nota3, soma,mediaAritmetica, mediaPonderada;

        //Ler numero
        System.out.print("Insira a 1º nota: ");
        nota1 = input.nextDouble();

        System.out.print("Insira a 2º nota: ");
        nota2 = input.nextDouble();

        System.out.print("Insira a 3º nota: ");
        nota3 = input.nextDouble();

        //soma
        soma = nota1 + nota2 + nota3;
        System.out.println("Resultado dos valores:" + soma);

        //media aritmetica
        mediaAritmetica = soma/3;
        System.out.println("Media aritmética: " + mediaAritmetica);

        //media ponderada
        mediaPonderada = (nota1 * 0.20) + (nota2 * 0.30) + (nota3 * 0.50);
        System.out.println("Media Ponderada: " + mediaPonderada);



    }
}
