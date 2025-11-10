package FichaPratica02;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {

        //scanner
        Scanner input = new Scanner(System.in);

        //variaveis
        int n1, n2, n3;
        char ordem;

        //ler variavies
        System.out.println("Introduza um numero: ");
        n1 = input.nextInt();

        System.out.println("Introduza um numero: ");
        n2 = input.nextInt();

        System.out.println("Introduza um numero: ");
        n3 = input.nextInt();

        System.out.println("Ordem crescente insira: c\nOrdem decrescente insira: d\nQuer ordenar por ordem: ");
        ordem =input.next().charAt(0);

        switch (ordem){

            case 'c':
                if (n1 <= n2 && n1 <= n3) {
                    if (n2 <= n3) {
                        System.out.println(n1 + " " + n2 + " " + n3);
                    } else {
                        System.out.println(n1 + " " + n3 + " " + n2);
                    }

                } else if (n2 <= n1 && n2 <= n3) {
                    if (n1 <= n3) {
                        System.out.println(n2 + " " + n1 + " " + n3);
                    } else {
                        System.out.println(n2 + " " + n3 + " " + n1);
                    }

                } else {
                    if (n1 <= n2) {
                        System.out.println(n3 + " " + n1 + " " + n2);
                    } else {
                        System.out.println(n3 + " " + n2 + " " + n1);
                    }
                }
                break;

            case 'd':
                if (n1 >= n2 && n1 >= n3) {
                    if (n2 >= n3) {
                        System.out.println(n1 + " " + n2 + " " + n3);
                    } else {
                        System.out.println(n1 + " " + n3 + " " + n2);
                    }

                } else if (n2 >= n1 && n2 >= n3) {
                    if (n1 >= n3) {
                        System.out.println(n2 + " " + n1 + " " + n3);
                    } else {
                        System.out.println(n2 + " " + n3 + " " + n1);
                    }

                } else {
                    if (n1 >= n2) {
                        System.out.println(n3 + " " + n1 + " " + n2);
                    } else {
                        System.out.println(n3 + " " + n2 + " " + n1);
                    }
                }
                break;

            default:
                System.out.println("Caracter errado");
                break;
        }
    }
}
