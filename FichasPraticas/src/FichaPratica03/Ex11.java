package FichaPratica03;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        //variaveis
        int limite, salto, contador;

        //ler
        System.out.print("Introduza um limite: ");
        limite = input.nextInt();

        System.out.print("Introduza um salto: ");
        salto = input.nextInt();

        contador = 0;

        while (contador <= limite){
            System.out.println(contador);
            contador = contador + salto;

        }
    }
}
