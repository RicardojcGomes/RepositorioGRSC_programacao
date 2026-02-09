package FichaPratica05;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //criar matriz

        int [][] lista = new int[4][4];

        //pedir ao utilizador e guardar

        for (int i =0; i < lista.length; i++){

            for (int j = 0; j < lista[0].length; j++){

                System.out.print("Insira o numero na matriz [" + i + "][" + j + "]: ");
                lista[i][j] = input.nextInt();

            }

        }

        System.out.println();

        //Encontrar a soma da diagonal

        int soma = 0;

        for (int i = 0; i < lista.length; i++){

            for (int j = 0; j < lista[0].length; j++ ){

                if (lista[i] == lista[j]){
                    soma += lista[i][i];

                }


            }

        }

        System.out.println("A soma da diagonal principa é: " + soma);









    }
}
