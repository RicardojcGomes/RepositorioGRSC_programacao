package FichaPratica02;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        //scanner
        Scanner input = new Scanner(System.in);

        //variaveis
        double n1, n2;
        char  operador;

        //ler variavies
        System.out.print("Insira um numero:");
        n1 = input.nextDouble();

        System.out.print("Insira um numero:");
        n2 = input.nextDouble();

        System.out.print("Operação aritmetica (+, -, *, /):");
        operador = input.next().charAt(0);

        //atribuir

        switch (operador){
            case '+' :
                System.out.println( "Resultado = " + (n1 + n2));
                break;

            case '-' :
                System.out.println( "Resultado = " + (n1 - n2));
                break;

            case '*' :
                System.out.println( " resultado = " + (n1 * n2));
                break;

            case '/' :
                if (n2 != 0) {
                    System.out.println( " resultado = " + (n1 / n2));
                }
                else {
                    System.out.println("A operação não é possível!");
                }
                break;

            default:
                System.out.println("Operação é inválida");
        }

    }
}
