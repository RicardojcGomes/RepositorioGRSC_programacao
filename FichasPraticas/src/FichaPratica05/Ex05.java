package FichaPratica05;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        //Declarar vetor

        int[] lista = new int[10];

        int soma = 0;

        //ler e guardar resultados

        for (int i = 0; i < lista.length; i++) {
            System.out.print("Introduza um numero: ");
            lista[i] = input.nextInt();
            soma = soma + lista[i];
        }

        int media;

        media = soma / lista.length;

        System.out.println("A média dos elementos é: " + media);


    }

}