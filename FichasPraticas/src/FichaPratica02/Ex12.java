package FichaPratica02;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //variavel
        int opcao;

        //apresentar menu e ler opção
        System.out.println("Menu de opções:\n1 - Criar\n2 - Atualizar\n3 - Eliminar\n4 - Sair");
        System.out.print("Escolha a opção do menu: ");
        opcao = input.nextInt();


        //opção escolhida
        switch (opcao){
            case 1:
                System.out.println("Selecionou a opção: Criar");
                break;

            case 2:
                System.out.println("Selecionou a opção: Atualizar");
                break;

            case 3:
                System.out.println("Selecionou a opção: Eliminar");
                break;

            case 4 :
                break;

            default:
                System.out.println("Opção inválida");
                break;
        }

    }
}
