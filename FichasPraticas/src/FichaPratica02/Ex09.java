package FichaPratica02;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {

        //scanner
        Scanner input = new Scanner(System.in);

        //variaveis
        int n1, n2, n3;

        //ler variaveis
        System.out.print("Insira um numero: ");
        n1 = input.nextInt();

        System.out.print("Insira um numero: ");
        n2 = input.nextInt();

        System.out.print("Insira um numero: ");
        n3 = input.nextInt();

        //ler e apresentar
        if (n1 < n2 && n1 < n3) {
            System.out.println("O menor numero é : " + n1);
        }
        else if(n2 < n1 && n2 < n3){
            System.out.println("O menor numero é : " + n2);
        }
        else if (n3 < n1 && n3 < n2 ){
            System.out.println("O menor numero é: " + n3);
        }
        else {
            System.out.println("Os numeros são todos iguais!");
        }

    }
}
