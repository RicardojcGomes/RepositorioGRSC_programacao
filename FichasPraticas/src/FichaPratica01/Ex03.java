package FichaPratica01;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        // Import do Scanner - Fazemos sempre que queremos ler dados do utilizador
        Scanner input = new Scanner(System.in);

        //Declarar as variáveis
        double lado1, lado2, resultado;

        //Ler dimensoes
        System.out.print("Insira o comprimento: ");
        lado1 = input.nextDouble();

        System.out.print("Insira a altura: ");
        lado2 = input.nextDouble();

        //area
        resultado = lado1 * lado2;
        System.out.println("Área do retângulo: " + resultado);

        //Perimetro
        resultado = 2 * (lado1 + lado2);
        System.out.println("Perímetro do retângulo: " + resultado);

    }
}
