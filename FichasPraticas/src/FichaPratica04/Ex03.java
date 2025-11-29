package FichaPratica04;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);


        int valor1, valor2, opcao;
        String resposta;

        //pedir 2 valores e operação +-*/

        do {
            System.out.println("****** Menu *******");
            System.out.println("Escolha a operação a realizar");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("0 - Sair");

            System.out.print("Introduza um valor: ");
            valor1 = input.nextInt();

            System.out.print("Introduza um valor: ");
            valor2 = input.nextInt();

            System.out.print("Insira uma opção: ");
            opcao = input.nextInt();

            switch (opcao){

                case 1:
                    System.out.println("O resultado é: " + (valor1 + valor2));
                    break;

                case 2:
                    System.out.println("O resultado é: " + (valor1 - valor2));
                    break;

                case 3:
                    System.out.println("O resultado é: " + (valor1 * valor2));
                    break;

                case 4:
                    System.out.println("O resultado é: " + (valor1 / valor2));
                    break;

                case 5:
                    System.out.println("A terminar!!");

                default:
                    System.out.println("Operação Inválida!");
                    break;
            }


                    System.out.println(" ");
                    System.out.print("Deseja continuar? (s/n): ");
                    resposta = input.next();

        }while (resposta.equals("s"));


























    }
}
