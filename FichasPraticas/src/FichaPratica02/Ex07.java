package FichaPratica02;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        //scanner
        Scanner input = new Scanner(System.in);

        //variaveis
        int numero;

        //ler variavel
        System.out.print("Introduza um numero: ");
        numero  = input.nextInt();

        //ler
        if (numero % 2 == 0) {
            System.out.println("O número é par");
        }
        else {
            System.out.println("O número é ímpar");
        }





    }
}
