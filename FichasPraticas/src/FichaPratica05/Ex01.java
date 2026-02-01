package FichaPratica05;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        //declarar variavies

        int[] numero = new int[10];

        //leitura do vetor

        for (int i = 0; i < numero.length; i++){
            System.out.print("Insira no vetor [" + i + "]: ");
            numero[i] = input.nextInt();
        }


        System.out.println("_______________________");


        //impressão do vetor

        for (int i = 0; i < numero.length; i++){
            System.out.println("Vetor[" + i + "]: " + numero[i]);
        }

    }

}
