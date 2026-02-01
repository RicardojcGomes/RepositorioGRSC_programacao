package FichaPratica05;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //criar matriz

        int [][] lista = new int[5][5];
        int somaTotal = 0;


        //ler cada linha e coluna -  guardar numero - somar

        for (int i = 0; i < lista.length; i++){

            for (int j = 0; j <lista[0].length; j++){
                System.out.print("Insira na matriz [" + i + "][" + j + "]: ");
                lista[i][j] = input.nextInt();
                somaTotal = somaTotal + lista[i][j];
            }

        }

        System.out.println();

        //apresentar tabela

        for (int i = 0; i < lista.length; i++){

            for (int j  = 0; j < lista[0].length; j++){

                System.out.print(lista[i][j] + " ");

            }
            System.out.println();

        }


        System.out.println();

        // apresentar resultado

        System.out.println("A soma de todos elementos é: " + somaTotal);

    }

}
