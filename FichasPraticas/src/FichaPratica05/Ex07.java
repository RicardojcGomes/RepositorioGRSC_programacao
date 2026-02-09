package FichaPratica05;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //criar vetor

        int [] lista = new int[10];


        //ler numero e armazenar em cada vetor

        for (int i = 0; i < lista.length; i++){
            System.out.print("Introduza o numero: ");
            lista[i] = input.nextInt();
        }

        //ver se é par e apresentar o maior

        int maiorpar = 0;
        boolean par = false;

        for (int i = 0; i < lista.length; i++){
            if (lista[i] % 2 == 0){

                if (lista[i] > maiorpar ){
                    maiorpar = lista[i];
                    par =true;

                }

            }

        }

        if (par == true){
            System.out.print("Maior numero par inserido: " + maiorpar);
        } else{
            System.out.println("Não foi inserido nenhum numero par!");
        }











    }
}
