package FichaPratica02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EX01 {
    public static void main(String[] args) {

        //scanner
        Scanner input = new Scanner(System.in);

        // variavies

        int numero1, numero2;

        //ler variavies
        System.out.print("Imtroduza um numero: ");
        numero1 = input.nextInt();

        System.out.print("Imtroduza um numero: ");
        numero2 = input.nextInt();

        //se, entao , senao
        if (numero1 > numero2 ) {
        System.out.println("Maior: " + numero1);
    } else if (numero1 < numero2) {
        System.out.println("Maior: " + numero2);
    } else {
        System.out.println("Os numeros são iguais " + numero1);
        }

    }
}
