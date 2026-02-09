import java.util.Scanner;

public class Ex_Galo {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        boolean continuar = true;
        int escolha;

        // Ciclo principal do programa

        do {
            // Apresentação inicial do jogo

            JogoGalo.apresentarTitulo();

            // Iniciar uma nova partida

            JogoGalo.iniciarPartida();

            // Menu final do jogo

            System.out.println("\n************ MENU ************");
            System.out.println("1. Jogar Novamente");
            System.out.println("2. Sair\n");
            System.out.println("==============================");
            System.out.print("Escolha uma opção: ");
            escolha = input.nextInt();

            // Avaliar a escolha do escolha do utilizador

            while (escolha != 1 && escolha != 2) {
                System.out.println("Opção inválida! Escolha 1 ou 2.");
                System.out.print("Escolha uma opção: ");
                escolha = input.nextInt();
            }

            // verificar se vai continuar a jogar ou não

            if (escolha == 2) {
                continuar = false;
                System.out.println("\nObrigado por jogar! Até à próxima!");
            }

        } while (continuar);

        input.close();
    }
}
