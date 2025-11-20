package FichaPratica03;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, inicio, fim, contador;

        System.out.print("Introduza um numero: ");
        num = input.nextInt();

        inicio = num - 5;
        fim = num + 5;

        while (inicio <= fim) {
            System.out.println(inicio);
            inicio = inicio +1;

        }
    }
}
