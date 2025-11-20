package FichaPratica03;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {

        Scanner inpu = new Scanner(System.in);

        int num, soma, contagem, media;

        num = 0;
        soma = 0;
        contagem = 0;


        while (num != -1) {

            System.out.print("Introduza um numero: ");
            num = inpu.nextInt();

            soma = soma + num;
            contagem = contagem + 1;

        }

        if (contagem > 0) {
            media = soma / contagem;
            System.out.println("A media é: " + media);

        } else {
            System.out.println("Não forma itroduzidos números válidos!");
        }


    }

}
