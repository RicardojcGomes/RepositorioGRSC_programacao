package FichaPratica02;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

        //scanner
        Scanner input = new Scanner(System.in);

        //variaveis
        int hora, minuto;

        System.out.print("Introduza a hora: ");
        hora = input.nextInt();

        System.out.print("Introduza os minutos: ");
        minuto = input.nextInt();

        if (hora > 12) {
            System.out.println((hora - 12)+ ": " + minuto + " PM");
        } else if (hora < 12 && hora != 0 ) {
            System.out.println(hora + ": " + minuto + " AM");
        } else if (hora == 0 ) {
            System.out.println( 12 + ": " + minuto + " AM");
        } else if (hora == 12) {
            System.out.println(12 + ": " + minuto + " PM");
        }


    }
}
