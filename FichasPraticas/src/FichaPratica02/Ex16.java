package FichaPratica02;

import java.util.Scanner;

public class Ex16 {
    public  static void main(String[] args) {

     //scanner do input

        Scanner input = new Scanner(System.in);

        //variaveis
        int n1, nota200, nota100, nota50, nota20, nota10, nota5, resto, resto100, resto50, resto20, resto10, resto5;


        //ler variavel

        System.out.print("Insira um numero: ");
        n1 = input.nextInt();


        if (n1 % 5 == 0) {
            nota200 = n1 / 200;
            resto = n1 % 200;
            System.out.println(" Notas de 200: " + nota200);


            nota100 = resto / 100;
            resto100 = resto % 100;
            System.out.println(" Notas de 100: " + nota100);

            nota50 = resto100 / 50;
            resto50 = resto100 % 50;
            System.out.println(" Notas de 50: " + nota50);

            nota20 = resto50 / 20;
            resto20 = resto50 % 20;
            System.out.println(" Notas de 20: " + nota20);

            nota10 = resto20 / 10;
            resto10 = resto20 % 10;
            System.out.println(" Notas de 10: " + nota10);

            nota5 = resto10 / 5;
            resto5 = resto10 / 5;
            System.out.println(" Notas de 5: " + nota5);

        } else {
            System.out.println(" Operação invalida!");
        }
















        }
















    }

