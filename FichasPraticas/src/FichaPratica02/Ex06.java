package FichaPratica02;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        //scanner
        Scanner input = new Scanner(System.in);

        //variavies
        int numero1, numero2;

        //ler variaveis
        System.out.println("Introduza um número: ");
        numero1 = input.nextInt();

        System.out.println("Introduza um número: ");
        numero2 = input.nextInt();

        //if else
        if (numero1 > numero2) {
            System.out.println(numero1 + " " + numero2);
        } else {
            System.out.println(numero2 + " " + numero1);
        }










    }
}
