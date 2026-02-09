package FichaPratica05;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        //implemetar matriz

        int [][] lista = new int[3][3];


        //pedir numero e armazenar

        for (int linha = 0; linha < lista.length; linha++){

            for (int coluna = 0; coluna < lista[0].length; coluna++){
                System.out.print ("Insira na matriz [" + linha + "][" + coluna + "]: ");
                lista[linha][coluna] = input.nextInt();

            }

        }

        for (int linha = 0; linha < lista.length; linha++){

            for (int coluna = 0; coluna < lista[0].length; coluna++){

                System.out.print(lista[linha][coluna] + " ");

            }
            System.out.println();

        }












    }


}
