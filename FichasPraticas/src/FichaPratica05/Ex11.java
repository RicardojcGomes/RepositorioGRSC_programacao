package FichaPratica05;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        //criar matriz

        int [][] lista = new int[3][3];

        //pedir numero ao utilizador e guardar na matriz

        for (int i = 0; i < lista.length; i++){

            for (int j = 0; j < lista[0].length; j++){

                System.out.print("Insira o numero na matriz [" + i + "][" + j + "]: ");
                lista[i][j] = input.nextInt();

            }

        }


        System.out.println();

        // imprimir os numero 3x3

        for (int i = 0; i < lista.length; i++){

            for (int j = 0; j < lista[0].length; j++){

                System.out.print(lista[i][j] + " ");
            }
            System.out.println();

        }

        System.out.println();

        //Apresentar maior e menor numero inserido

        int maior = 0, menor = lista[0][0];

        for (int i = 0; i < lista.length; i++){

            for (int j = 0; j < lista[0].length; j++){

                if (lista[i][j] > maior){
                    maior = lista[i][j];

                }

                if (lista [i][j] < menor){
                    menor = lista[i][j];
                }

            }


        }

        System.out.println("O maior numero introduzido na matriz foi: " + maior);
        System.out.println();
        System.out.println("O menor numero introduzido na matriz foi: " + menor);



    }

}
