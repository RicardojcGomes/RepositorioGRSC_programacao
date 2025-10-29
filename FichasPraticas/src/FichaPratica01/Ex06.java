package FichaPratica01;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //declarar as variaveis

        int valor1, valor2;

       //ler valores
        System.out.print("Insira o 1º valor: ");
        valor1 = input.nextInt();

        System.out.print("Insira o 2º valor: ");
        valor2 = input.nextInt();

        //troca
        System.out.println("\nTroca efetuada...");
        valor1 = valor1 + valor2;
        valor2 = valor1 - valor2;
        valor1 = valor1 - valor2;


        //apresentar valores

        System.out.println("Valor 1: " + valor1);
        System.out.println("valor2: " + valor2);


    }
}
