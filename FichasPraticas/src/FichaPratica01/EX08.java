package FichaPratica01;

import java.util.Scanner;

public class EX08 {
    public static void main(String[] args) {

        //import scanner
        Scanner input = new Scanner(System.in);

        //variaveis
        int minutos1, segundos1, minutos2, segundos2, minutos3, segundos3, minutos4, segundos4, minutos5, segundos5, totalsegundos, horas, segundos, minutos, restos;

        //Ler variaveis

        //musica1
        System.out.print("Introduza os segundos da música 1: ");
        segundos1 = input.nextInt();
        System.out.print("Introduza os minutos da música 1: ");
        minutos1 = input.nextInt();

        //musica2
        System.out.print("Introduza os segundos da música 2: ");
        segundos2 = input.nextInt();
        System.out.print("Introduza os minutos da música 2: ");
        minutos2 = input.nextInt();

        //musica3
        System.out.print("Introduza os segundos da música 3: ");
        segundos3 = input.nextInt();
        System.out.print("Introduza os minutos da música 3: ");
        minutos3 = input.nextInt();

        //musica4
        System.out.print("Introduza os segundos da música 4: ");
        segundos4 = input.nextInt();
        System.out.print("Introduza os minutos da música 4: ");
        minutos4 = input.nextInt();

        //musica5
        System.out.print("Introduza os segundos da música 5: ");
        segundos5 = input.nextInt();
        System.out.print("Introduza os minutos da música 5: ");
        minutos5 = input.nextInt();


        //soma dos segundos e conversão
        totalsegundos = (minutos1 * 60 + segundos1) + (minutos2 * 60 + segundos2) + (minutos3 * 60 + segundos3) + (minutos4 * 60 + segundos4) + (minutos5 * 60 + segundos5);

        System.out.println("\nA converter...");

        horas = totalsegundos / 3600;
        restos = totalsegundos % 3600;
        minutos = restos / 60;
        segundos = restos % 60;


        System.out.println("Total do albúm: " + horas + "h "  + minutos + "m "  + segundos + "s");

    }
}
