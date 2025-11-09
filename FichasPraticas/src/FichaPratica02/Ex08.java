package FichaPratica02;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        //scanner
        Scanner input = new Scanner(System.in);

        //variavies
        double nota1, nota2, nota3, mediaPonderada;

        //ler variavesi
        System.out.print("Introduza o valor da nota 1: ");
        nota1 = input.nextDouble();

        System.out.print("Introduza o valor da nota 2: ");
        nota2 = input.nextDouble();

        System.out.print("Introduza o valor da nota 3: ");
        nota3 = input.nextDouble();

        mediaPonderada = (nota1 * 0.25) + (nota2 * 0.35) + (nota3 * 0.40);
        System.out.println("A média ponderada é: " + mediaPonderada);

        if (mediaPonderada < 9.5) {
            System.out.println("Está reprovado!");
        } else {
            System.out.println("Está aprovado!");
        }














    }
}
