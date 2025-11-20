package FichaPratica03;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, numsms;
        String mensagem;

        System.out.print("Introduza um numero: ");
        num1 = input.nextInt();
        input.nextLine();

        System.out.print("Introduza uma mensagem: ");
        mensagem = input.nextLine();

        numsms = 1;

        while (numsms <= num1) {
            System.out.println( mensagem);
            numsms = numsms +1;

        }










    }
}
