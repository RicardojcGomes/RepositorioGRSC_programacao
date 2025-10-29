package FichaPratica01;

import java.util.Scanner;

public class Ex04_prof {
    public static void main(String[] args) {

        //import do scanner
        Scanner input = new Scanner(System.in);

        //Declarar as variavies
        double raio, area, pi = 3.14;


        //ler raio
        System.out.print("Introduzir o raio: ");
        raio = input.nextDouble();

        //Cacular e apresentar area
        area = pi * raio * raio;
        System.out.println("Area: " + area);

    }
}
