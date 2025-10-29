package FichaPratica01;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        
        // Import do Scanner - Fazemos sempre que queremos ler dados do utilizador
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        double raio, resultado;

        //Ler numero
        System.out.print("Insira o raio: ");
        raio = input.nextDouble();

       //raio x raio
        resultado = raio * raio;
        System.out.println("Raio: " + resultado);

        //Raio vezes pi
        resultado = (raio * raio) * 3.14;
        System.out.println("Área da circunferência: " + resultado);
    }
}
