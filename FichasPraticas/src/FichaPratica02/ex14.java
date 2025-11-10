package FichaPratica02;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {

        //scanner

        Scanner input = new Scanner(System.in);

        // variaveis
        int n1,n2, n3;

        //ler variavies
        System.out.print("Introduza oum numero: ");
        n1 = input.nextInt();

        System.out.print("Introduza oum numero: ");
        n2 = input.nextInt();

        System.out.print("Introduza oum numero: ");
        n3 = input.nextInt();


        //apresnetar
        if (n1 <= n2 && n2 <= n3) {
            System.out.println(n1 + " " + n2 + " " + n3);
        }

        else if (n1 <= n3 && n3 <= n2) {
            System.out.println(n1 + " " + n3 + " " + n2);
        }

        else if (n2 <= n1 && n1 <= n3) {
            System.out.println(n2 + " " + n1 + " " + n3 );
        }

        else if (n2 <= n3) {
            System.out.println(n2 + " " + n3 + " " + n1 );

        } else if (n2 <= n1) {
            System.out.println(n3 + " " + n2 + " " + n1 );
        }

        else  {
            System.out.println(n3 + " " + n1 + " " + n2);
        }


    }
}
