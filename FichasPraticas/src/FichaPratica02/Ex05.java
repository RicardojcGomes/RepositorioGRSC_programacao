package FichaPratica02;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);

        //variavies
        int numero1, numero2;

        //ler variaveis
        System.out.print("Introduza um número: ");
        numero1 = input.nextInt();

        System.out.print("Introduza um número: ");
        numero2 = input.nextInt();

        // menor e maior

        if (numero1 < numero2) {
            System.out.println(numero1 + " " + numero2);

        } else {
            System.out.println( numero2 + " " + numero1);
        }
    }
}
