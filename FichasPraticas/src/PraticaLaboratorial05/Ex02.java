package PraticaLaboratorial05;

import java.util.Scanner;

public class Ex02 {
    static void main() {

        Scanner input = new Scanner(System.in);

        //declarar variaveis

        double [] comissoes = new double[12];


        //Leitura do vetor
        for (int i = 0; i < comissoes.length; i++){
            System.out.println("Comissões do mês [" + i + "]: ");
            comissoes[i] = input.nextDouble();
        }


        //calcular o total anual
        double total = 0;

        for (int i = 0; i < comissoes.length; i++){
            total= total + comissoes[i];
        }

        System.out.println("Total anual: " + total);










    }
}
