package FichaPratica03;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);

        //variaveis
        int inicio, fim, contador;

        //ler

        System.out.print("Inroduza um numero inicial: ");
        inicio = input.nextInt();

        System.out.print("Introduza um numero final: ");
        fim = input.nextInt();

        contador = inicio;

        while (contador <= fim) {

            if ( contador % 5 == 0){
                System.out.println(contador);
            }

            contador = contador + 1;

        }

    }
}
