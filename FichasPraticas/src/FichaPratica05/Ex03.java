package FichaPratica05;

import java.util.Scanner;

public class Ex03 {
    static void main() {

        Scanner input = new Scanner(System.in);

        //declarar variaveis
        int [] lista = new int[10];

        //Leitura do vetor
        for (int i = 0; i < lista.length; i++){
            System.out.println("Introduza um numero inteiro: ");
            lista[i] = input.nextInt();
        }

        //apresentar o maior elemento
        int maior = lista[0];

        for (int i = 0; i < lista.length; i++){
            if (lista[i] < maior){
                maior = lista[i];
            }
        }

        System.out.println("O maior elemento é: " + maior);


    }
}
