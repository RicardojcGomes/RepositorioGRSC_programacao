package FichaPratica02;

import java.util.Scanner;

public class Ex04_variaveis {
    public static void main(String[] args) {

        //scanner
        Scanner input = new Scanner(System.in);

        //variaveis

        int lugar1, lugar2, lugar3, lugar4, lugar5, lugar6, lugar7, lugar8, posicao1;

        //ler a posiçãos
        System.out.print("Introduza o seu lugar na corrida: ");
        posicao1 = input.nextInt();

        //atribuir pontos as posições

        lugar1 = 10;
        lugar2 = 8;
        lugar3 = 6;
        lugar4 = 5;
        lugar5 = 4;
        lugar6 = 3;
        lugar7 = 2;
        lugar8 = 1;

        //Atribuir posição ao lugar e ponto

        if (posicao1 == lugar1) {
            System.out.println("Ganhou" + lugar1 + " pontos");
        }








    }
}
