package FichaPratica02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        //scanner
        Scanner input = new Scanner(System.in);

        //variaveis
        double salario1, salario2, taxa20,taxa30;

        //ler variaveis
        System.out.print("Introduza um salario: ");
        salario1 = input.nextDouble();

        System.out.print("Introduza um salario: ");
        salario2 = input.nextDouble();

        // decidir o que usar , 20% ou 30%

        if (salario1 <= 15000) {
            System.out.println("Paga taxa de 20% : " + salario1 * 0.20);
        }
        else if (salario1 > 15000) {
            System.out.println("Paga taxa de 30% : " + salario1 * 0.30);
        }


        if (salario2 <= 15000) {
            System.out.println("Paga taxa de 20%: " + salario2 * 0.20);
        }
        else if (salario2 > 15000) {
            System.out.println("Paga taxa de 30%: " + salario2 * 0.30);
        }


    }
}