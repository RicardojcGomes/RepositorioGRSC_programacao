package FichaPratica01;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        // Import do Scanner - Fazemos sempre que queremos ler dados do utilizador
        Scanner input = new Scanner(System.in);

        //Declarar as variáveis
        double numero1, numero2, resultado;

        //Ler numero
        System.out.print("Insira um número: ");
        numero1 = input.nextDouble();

        System.out.print("Insira outro número: ");
        numero2 = input.nextDouble();

        //Soma
        resultado = numero1 + numero2;
        System.out.println("Soma: " + resultado);

        //subtração
        resultado = numero1 - numero2;
        System.out.println("Subtração: " + resultado);

        //Multiplicão
        resultado = numero1 * numero2;
        System.out.println("Multiplicação: " + resultado);

        //Divisão
        resultado = numero1 / numero2;
        System.out.println("Divisão : " + resultado);

    }
}


