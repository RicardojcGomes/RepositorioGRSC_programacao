package FichaPratica03;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //variavel
        int num, contador;

        System.out.print("Introduza um numero: ");
        num = input.nextInt();

        contador = 0;

        while (contador <= num ){
            System.out.println(contador);
            contador = contador + 1;
        }







    }
}
