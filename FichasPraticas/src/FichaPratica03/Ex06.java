package FichaPratica03;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, contador;

        System.out.print("Introduza um numero de inicio: ");
        num1 = input.nextInt();

        System.out.print("Introduza um numero final: ");
        num2 = input.nextInt();

        contador = num1;

        while (contador >= num1 && contador <= num2) {
            System.out.println(contador);
            contador = contador +1;

        }

    }
}
