package FichaPratica05;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // declarar variavel

        int [] lista = new int[10];

        // ler os vetores e guardar numeros
        for (int i = 0; i < lista.length; i++) {
            System.out.print("Introduza um numero inteiro: ");
            lista[i] = input.nextInt();
        }

        //Apresentar o menor numero
        int menor = lista[0];

        for (int i = 0; i < lista.length; i++){
            if (lista[i] < menor){
                menor  = lista[i];
            }
        }


        System.out.println("O menor numero é: " + menor);


















    }
}
