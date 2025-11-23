package FichaPratica03;

import java.util.Scanner;

public class Ex12_1 {
     public static void main(String[] args) {

        //scanner

         Scanner input = new Scanner(System.in);

         //variaveis
         int num, int1, int2, int3, int4;

         num= 0;
         int1 = 0;
         int2 = 0;
         int3 = 0;
         int4 = 0;

         while (num >= 0) {
             System.out.print("Introudza um número: ");
             num = input.nextInt();


             if (num >= 0 && num <= 25) {
                 int1 = int1 + 1;
             }
             else if (num >= 26 && num <= 50) {
                 int2 = int2 + 1;
             }
             else if (num >= 51 && num <= 75) {
                 int3 = int3 + 1;
             }
             else if (num >= 76 && num <= 100) {
                 int4 = int4 + 1;
             }

         }

         System.out.println("[00,25]: " + int1);
         System.out.println("[26,50]: " + int2);
         System.out.println("[51,75]: " + int3);
         System.out.println("[76,100]: " + int4);

    }
}
