package FichaPratica01;

import java.util.Scanner;

public class Ex01 {
   public static void main(String[] args) {


        // Import do Scanner - Fazemos sempre que queremos ler dados do utilizador
        Scanner input = new Scanner(System.in);

        //Declarar as variáveis
        int numero1, numero2, resultado;

        //Ler numero
        System.out.print("Insira um número: ");
        numero1 = input.nextInt();

        System.out.print("Insira outro número: ");
        numero2 = input.nextInt();

        //Soma
        resultado = numero1 + numero2;
        System.out.println("Soma: " + resultado);


    }
}
