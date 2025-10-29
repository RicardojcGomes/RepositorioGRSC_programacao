package FichaPratica01;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        //import do scanner
    Scanner input = new Scanner(System.in);

        //produtos, preço, valor a pagar 10% desconto

        double produto1, produto2, produto3, desconto, valor;

        //valor dos produtos
        System.out.print("Valor produto 1: ");
        produto1 = input.nextDouble();

        System.out.print("Valor produto 2: ");
        produto2 = input.nextDouble();

        System.out.print("Valor produto 3: ");
        produto3 = input.nextDouble();

        //desconto dos produtos
        desconto = (produto1+produto2+produto3) * 0.1;

        //Valor com desconto
        valor =  (produto1+produto2+produto3) - desconto;
        System.out.println("valor com desconto: " +valor);









    }
}
