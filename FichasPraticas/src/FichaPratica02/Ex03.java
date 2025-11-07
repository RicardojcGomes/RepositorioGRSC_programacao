package FichaPratica02;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

     //sanner
        Scanner input = new Scanner(System.in);

        //variaveis
        double salario1;

        //ler variaveis
        System.out.print("Intorduza o salário: ");
        salario1 = input.nextDouble();

        //apresentar
        if (salario1 <= 15000) {
            System.out.println("Paga taxa de 20%: " + salario1 * 0.20);
        }
        else if (salario1 >15000 && salario1 <=20000) {
            System.out.println("Paga taxa de 30%: " + salario1 * 0.30);
        }
        else if (salario1 > 20000 && salario1 <=25000) {
            System.out.println("Paga taxa de 35%: " + salario1 * 0.35) ;
        }
        else if (salario1 > 25000) {
            System.out.println("Paga taxa de 40%: " + salario1 * 0.40);
        }


    }
}
