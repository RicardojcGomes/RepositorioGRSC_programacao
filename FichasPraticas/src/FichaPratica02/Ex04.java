package FichaPratica02;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        //scanner
        Scanner input = new Scanner(System.in);

        //variaveis

        int posicao1;

        //ler a posiçãos
        System.out.print("Introduza o seu lugar na corrida: ");
        posicao1 = input.nextInt();

        //apresentar
        if (posicao1 == 1) {
            System.out.println("Ganhou 10 pontos");
        } else if (posicao1 == 2) {
            System.out.println("Ganhou 8 pontos");
        } else if (posicao1 == 3) {
            System.out.println("Ganhou 6 pontos");
        } else if (posicao1 == 4) {
            System.out.println("Ganhou 5 pontos");
        } else if (posicao1 == 5) {
            System.out.println("Ganhou 4 pontos");
        } else if (posicao1 == 6) {
            System.out.println("Ganhou 3 pontos");
        } else if (posicao1 == 7) {
            System.out.println("Ganhou 2 pontos");
        } else if (posicao1 == 8) {
            System.out.println("Ganhou 1 ponto");
        } else {
            System.out.println("Não ganhou pontos");
        }


    }
}
