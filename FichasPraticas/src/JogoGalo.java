import java.util.Scanner;

public class JogoGalo {

    // Variável para o Scanner
    static Scanner input = new Scanner(System.in);

    /**
     * Apresentar o título do jogo
     * Identificar os símbolos de cada jogador
     */
    public static void apresentarTitulo() {
        System.out.println("\n*******************************");
        System.out.println("       JOGO DO GALO      ");
        System.out.println("*******************************");
        System.out.println("Jogador 1: X | Jogador 2: O");
        System.out.println("*******************************\n");
    }

    /**
     * Iniciar todas as posições do tabuleiro vazias
     * Acrescenta o símbolo "-" em cada espaço vazio
     * @param tabuleiro - matriz 3x3
     */
    public static void inicializarTabuleiro(String[][] tabuleiro) {

        // Ciclos for para percorrer linhas e colunas
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                tabuleiro[linha][coluna] = "-";  // Posição vazia representada por "-"
            }
        }
    }

    /**
     * Apresentar o tabuleiro na consola
     * @param tabuleiro - matriz 3x3
     */
    public static void mostrarTabuleiro(String[][] tabuleiro) {

        System.out.println();

        // Ciclo for para percorrer as linhas
        for (int linha = 0; linha < tabuleiro.length; linha++) {

            // Ciclo for para percorrer as colunas
            for (int coluna = 0; coluna < tabuleiro[linha].length; coluna++) {
                System.out.print(tabuleiro[linha][coluna]);

                // Adicionar separador "|" entre colunas
                if (coluna < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            // Adicionar linha separadora entre linhas
            if (linha < 2) {
                System.out.println("----------");
            }
        }
        System.out.println();
    }


    /**
     * Realizar uma jogada válida
     * Pede ao utilizador a linha e a coluna onde quer jogar
     * Verifica se a escolha esat dentro da matriz e se a jogada é válida
     * @param tabuleiro - matriz 3x3
     * @param jogador - número do jogador (1 ou 2)
     */
    public static void realizarJogada(String[][] tabuleiro, int jogador) {

        int linha, coluna;
        boolean jogadaValida = false;
        String simbolo = (jogador == 1) ? "X" : "O";

        // Ciclo para garantir que a jogada é válida
        do {
            System.out.println("Jogador " + jogador + " (" + simbolo + ")");

            // Pedir linha ao jogador
            System.out.print("Introduza a linha (0 a 2): ");
            linha = input.nextInt();

            // Pedir coluna ao jogador
            System.out.print("Introduza a coluna (0 a 2): ");
            coluna = input.nextInt();

            // Validar se os valores estão dentro dos limites
            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
                System.out.println("\nERRO: Os valores estão fora dos limites! Escolha entre 0 e 2.\n");
            }

            // Validar se a posição está livre
            else if (!tabuleiro[linha][coluna].equals("-")) {
                System.out.println("\nERRO: Posição já está ocupada! Escolha outra posição!\n");
            }

            // Jogada válida
            else {
                tabuleiro[linha][coluna] = simbolo;
                jogadaValida = true;
            }

        } while (!jogadaValida);
    }

    /**
     * Verificar se o jogador atual venceu
     * Verifica todas as opções de vitória possiveis
     * @param tabuleiro - matriz 3x3 do tipo String
     * @param jogador - número do jogador (1 ou 2)
     * @return true se o jogador venceu, false caso contrário
     */
    public static boolean verificarVitoria(String[][] tabuleiro, int jogador) {

        //Define o símbolo que deve verificar
        String simbolo = (jogador == 1) ? "X" : "O";

        // Verificar linhas
        for (int linha = 0; linha < 3; linha++) {
            if (tabuleiro[linha][0].equals(simbolo) &&
                    tabuleiro[linha][1].equals(simbolo) &&
                    tabuleiro[linha][2].equals(simbolo)) {
                return true;
            }
        }

        // Verificar colunas
        for (int coluna = 0; coluna < 3; coluna++) {
            if (tabuleiro[0][coluna].equals(simbolo) &&
                    tabuleiro[1][coluna].equals(simbolo) &&
                    tabuleiro[2][coluna].equals(simbolo)) {
                return true;
            }
        }

        // Verificar diagonal principal
        if (tabuleiro[0][0].equals(simbolo) &&
                tabuleiro[1][1].equals(simbolo) &&
                tabuleiro[2][2].equals(simbolo)) {
            return true;
        }

        // Verificar diagonal secundária
        if (tabuleiro[0][2].equals(simbolo) &&
                tabuleiro[1][1].equals(simbolo) &&
                tabuleiro[2][0].equals(simbolo)) {
            return true;
        }

        // Não há vitória
        return false;
    }


    /**
     * iniciar a partida completa
     * inicia o tabuleiro
     * verifica e valida jogadas e alterna entre jogadores
     * Verifica se exite vitoria ou empate
     */
    public static void iniciarPartida() {


        // Declaração da matriz 3x3 para o tabuleiro
        String[][] tabuleiro = new String[3][3];

        // Inicializar tabuleiro novo
        inicializarTabuleiro(tabuleiro);

        // Variáveis do jogo
        int turnoAtual = 1;                                     // Controla quem é a jogar (1 ou 2)
        int jogadasRealizadas = 0;                             // Contador das jogadas
        boolean jogoTerminou = false;

        // Ciclo principal da partida (while)
        while (!jogoTerminou) {

            // Apresentar o tabuleiro atual
            mostrarTabuleiro(tabuleiro);

            // Realizar a jogada do jogador atual
            realizarJogada(tabuleiro, turnoAtual);
            jogadasRealizadas++;

            // Verificar se existe algum vencedor após a jogada
            if (verificarVitoria(tabuleiro, turnoAtual)) {
                mostrarTabuleiro(tabuleiro);
                System.out.println("\n*** Jogador " + turnoAtual + " venceu o jogo! ***\n");
                jogoTerminou = true;
            }

            // Verificar empate
            else if (jogadasRealizadas == 9) {
                mostrarTabuleiro(tabuleiro);
                System.out.println("\n*** Empate! O tabuleiro está completo. ***\n");
                jogoTerminou = true;
            }

            // Alternar entre jogadores
            else {
                turnoAtual = (turnoAtual == 1) ? 2 : 1;
            }
        }
    }

}

