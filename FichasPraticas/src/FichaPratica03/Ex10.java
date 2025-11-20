package FichaPratica03;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        //improt

        Scanner inuput = new Scanner(System.in);


        //variaveis
        int num1, contador;

        //ler variavel
        System.out.print("Introduza um numero: ");
        num1 = inuput.nextInt();

        contador = 2;

        //ler
        while (contador <= num1 ){
            System.out.println(contador);
            contador = contador + 2;
        }

    }
}
