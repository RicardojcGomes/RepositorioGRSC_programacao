package FichaPratica05;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //criar matriz

        int [][] lista = new int[3][5];

        //pedir numero ao utilizador

        for (int i =0; i < lista.length; i++){

            for (int j = 0; j < lista[0].length; j++){
                System.out.print("Insira o numero na matriz [" + i + "][" + j + "]: ");
                lista[i][j] = input.nextInt();

            }

        }
        System.out.println();

        //imprimir a matriz

        for (int i = 0; i < lista.length; i++){

            for (int j  = 0; j < lista[0].length; j++){

                System.out.print(lista[i][j] + " ");

            }
            System.out.println();

        }

       //pedir numero a procurar
       int procurar;
        int contador = 0;

        System.out.print("Insira o número que pretende procurar: ");
        procurar = input.nextInt();


        //procurar o numero e contar
        for (int i = 0; i < lista.length; i++){

            for (int j  = 0; j < lista[0].length; j++){

                if (lista[i][j] == procurar){
                    contador++;
                }
            }
        }

        // Apresentar o resultado

        System.out.println();
        System.out.println("Existe " + contador + "posicões com o número " + procurar);



    }
}
