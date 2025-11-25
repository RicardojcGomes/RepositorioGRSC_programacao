package FichaPratica03;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {

        //scanner

        Scanner input = new Scanner(System.in);


        // variaveis

        int contador, anterior, atual;


        System.out.print("Quantos números deseja inserir: ");
        contador = input.nextInt();

        System.out.print("Introduza um número: ");
        anterior = input.nextInt();

        boolean crescente = true;


        for (int perguntas = 1; perguntas < contador; perguntas++) {

            System.out.print("Introduza um número: ");

            atual = input.nextInt();

            if (atual <= anterior) {

                crescente = false;
            }

            anterior = atual;
        }

        if (crescente) {
            System.out.println("Crescente");
        } else {
            System.out.println("Decrescente");
        }


    }

}
