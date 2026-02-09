package FichaPratica05;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //declarar vetor

        int [] lista = new int[10];


        //ler e guardar numeros

        for (int i = 0; i < lista.length; i++){
            System.out.print("Introduza um numero: ");
            lista[i] = input.nextInt();
        }


        //ler o vetor e apresentar resulado
        boolean crescente = true;

        for (int i = 0; i < lista.length - 1; i++){

            if (lista[i] > lista[i + 1]){
                crescente = false;
            }

        }

        if (crescente) {
            System.out.println("Esta por ordemm crescente!");

        } else {
            System.out.println("Não esta por ordem crescente!");
        }






    }
}


