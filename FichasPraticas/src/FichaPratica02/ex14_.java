package FichaPratica02;

import java.util.Scanner;

public class ex14_ {
    public static void main(String[] args) {

        //scanner

        Scanner input = new Scanner(System.in);

        // variaveis
        int n1,n2, n3;

        //ler variavies
        System.out.print("Introduza o 1º numero: ");
        n1 = input.nextInt();

        System.out.print("Introduza o 2º numero: ");
        n2 = input.nextInt();

        System.out.print("Introduza o 3º numero: ");
        n3 = input.nextInt();

        //ler

        if (n1 <= n2 && n1 <= n3) {
          if (n2 < n3) {
              System.out.println(n1 + " " + n2 + " " + n3);
          } else {
              System.out.println(n1 + " " + n3 + " " + n2);
          }

        } else if (n2 <= n1 && n2 <= n3) {
            if (n1 < n3) {
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
    }
}
