package jogos.velha;

public class Menu {

    public static void main(String[] args) {
        Velha jogo = new Velha("Primeiro Jogo", 6, "Bolsonaro", "Lula");

//        jogo.log("\nRODADA 1");
//        jogo.fazerJogada(jogo.getJogador1(), 'X', 0, 0);
//        jogo.fazerJogada(jogo.getJogador2(), 'O', 2, 1);
//
//        jogo.log("\nRODADA 2");
//        jogo.fazerJogada(jogo.getJogador1(), 'X', 0, 1);
//        jogo.fazerJogada(jogo.getJogador2(), 'O', 2, 1);
//
//        jogo.log("\nRODADA 3");
//        jogo.fazerJogada(jogo.getJogador1(), 'X', 0, 2);
//        jogo.fazerJogada(jogo.getJogador2(), 'O', 2, 1);
//
//        jogo.log("\nRODADA 4");
//        jogo.fazerJogada(jogo.getJogador1(), 'X', 0, 2);
//        jogo.fazerJogada(jogo.getJogador2(), 'O', 2, 1);

        jogo.fazerJogada(jogo.getJogador1(), 'O', 0, 0);
        jogo.fazerJogada(jogo.getJogador1(), 'O', 1, 1);
        jogo.fazerJogada(jogo.getJogador1(), 'O', 2, 2);
        jogo.fazerJogada(jogo.getJogador1(), 'O', 3, 3);
        jogo.fazerJogada(jogo.getJogador1(), 'O', 4, 4);
        jogo.fazerJogada(jogo.getJogador1(), 'O', 5, 5);

        jogo.statusJogo();
        jogo.obterHistorico();

    }
}
