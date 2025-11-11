package FichaPratica02;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        //scanner
        Scanner input = new Scanner(System.in);

        //variaveis
        double saldo, movimento, saldoFinal;

        //ler variaveis
        System.out.print("Introduza o seu saldo: ");
        saldo = input.nextDouble();

        System.out.print("Introduza o valor a movimentar: ");
        movimento = input.nextDouble();

        //saldo final
        saldoFinal = saldo + movimento;

        if (movimento > 0 ) {
            System.out.println("Operação realizada com sucesso: Depósito");
            System.out.println("Saldo atual: " + saldoFinal);
        }
        else if (movimento  < 0 &&  saldoFinal >= 0 ) {
            System.out.println("Operação realizada com sucesso: Levantamento");
            System.out.println("Saldo atual: " + saldoFinal);
        }
        else if (saldoFinal < 0) {
            System.out.println("Operação inválida. Saldo insuficiente.");
            System.out.println("Saldo atual: " + saldo);
        }
        else
            System.out.println("Operação inválida");
        }



    }










