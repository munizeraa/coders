package jogos.velha;

public class Velha {

    // PROPRIEDADES

    private int dimensao;
    private String nome;
    private String[][] tabuleiro;
    private String[] historico;
    private String jogador1;
    private String jogador2;
    private String vencedor;

    // METODO CONSTRUTOR

    public Velha(String nome, int dimensao, String jogador1, String jogador2) {
        this.nome = nome;
        this.dimensao = dimensao;
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
        this.tabuleiro = new String[this.dimensao][this.dimensao];
        this.historico = new String[dimensao * 10];
        this.saudarJogadores();
        this.configurarCasasDoJogo();
    }

    /**
     * GETTES E SETTERS
     */

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDimensao() {
        return dimensao;
    }

    public void setDimensao(int dimensao) {
        this.dimensao = dimensao;
    }

    public String[][] getTabuleiro() {
        return tabuleiro;
    }

    public String getJogador1() {
        return this.jogador1;
    }

    public String getJogador2() {
        return this.jogador2;
    }

    // METODOS DO JOGO

    public void statusJogo() {
        for(int i = 0; i < dimensao; ++i) {
            for(int j = 0; j < dimensao; ++j) {
                System.out.print("  " + this.tabuleiro[i][j] + "  ");
            }
            System.out.println("\n");
        }
    }

    public void fazerJogada(String jogador, char jogada, int linha, int coluna) {
        this.tabuleiro[linha][coluna] = String.valueOf(jogada);

        String evento = String.format("O jogador %s marcou um %s nas coordenatas %s e %s", jogador, jogada, linha, coluna);
        log(evento);

        analisarRodada(jogador, jogada);
    }

    private void saudarJogadores() {
        System.out.println("\n\n###################### JOGO DA VELHA ######################\n\n");
        System.out.printf("Jogadores: %s e %s%n\n\n", this.jogador1, this.jogador2);
    }

    private void configurarCasasDoJogo() {
        for(int i = 0; i < dimensao; ++i) {
            for(int j = 0; j < dimensao; ++j) {
                this.tabuleiro[i][j] = "-";
            }
        }
    }

    private boolean analisarRodada(String jogador, char jogada) {

        if(checarHorizontal(String.valueOf(jogada)) ||
           checarVertical(String.valueOf(jogada)) ||
           checarDiagonalLR(String.valueOf(jogada)) ||
           checarDiagonalRL(String.valueOf(jogada))) {

            this.vencedor = jogador;
            log(String.format("WOOOW!!! \n%s venceu a partida! ", jogador));
        }

        return false;
    }

    private boolean checarHorizontal(String simbolo) {
        String word = "";
        String jogadaVencedora = obterJogadaVencedora(simbolo);

        for(int linha = 0; linha < this.dimensao; ++linha) {
            for(int coluna = 0; coluna < this.dimensao; ++coluna) {
                word += this.tabuleiro[linha][coluna];
            }

            if (word.equals(jogadaVencedora)) {
                break;
            } else {
                word = "";
            }
        }

        return word.equals(jogadaVencedora);
    }

    private boolean checarVertical(String simbolo) {
        String word = "";
        String jogadaVencedora = obterJogadaVencedora(simbolo);

        for(int coluna = 0; coluna < this.dimensao; ++coluna) {
            for(int linha = 0; linha < this.dimensao; ++linha) {
                word += this.tabuleiro[linha][coluna];
            }

            if (word.equals(jogadaVencedora)) {
                break;
            } else {
                word = "";
            }
        }

        return word.equals(jogadaVencedora);
    }

    private boolean checarDiagonalLR(String simbolo) {
        String word = "";
        String jogadaVencedora = obterJogadaVencedora(simbolo);

        for(int i = 0; i < this.dimensao; ++i) {
            // Apenas para deixar mais explicita a logica
            int linha = i;
            int coluna = i;

            word += this.tabuleiro[linha][coluna];
        }

        return word.equals(jogadaVencedora);
    }

    private boolean checarDiagonalRL(String simbolo) {

        /** LOGICA ILUSTRATIVA DO RIGHT TO LEFT
         * ((this.dimension - 1) = 5) - (i = 5) = 0
         * ((this.dimension - 1) = 5) - (i = 4) = 1
         * ((this.dimension - 1) = 5) - (i = 3) = 2
         * ((this.dimension - 1) = 5) - (i = 2) = 3
         * ((this.dimension - 1) = 5) - (i = 1) = 4
         * ((this.dimension - 1) = 5) - (i = 0) = 5
         *
         */

        String word = "";
        String jogadaVencedora = obterJogadaVencedora(simbolo);

        for(int i = this.dimensao - 1; i >= 0; --i) {
            // Apenas para deixar mais explicita a logica
            int linha = (this.dimensao - 1) - i;
            int coluna = i;

            word += this.tabuleiro[linha][coluna];
        }

        return word.equals(jogadaVencedora);
    }

    private String obterJogadaVencedora(String simbolo) {
        String jogada = "";
        for(int i = 0; i < this.dimensao; ++i) {
            jogada += simbolo;
        }

        return jogada;
    }

    // METODOS DE UTILIDADE

    public void obterHistorico() {
        System.out.println("\n\n- Histórico da Partida -\n\n");
        for(int i = 0; i < this.historico.length; ++i) {
            if(this.historico[i] != null) {
                System.out.println(this.historico[i]);
            }
        }
    }

    public void log(String evento) {
        for(int i = 0; i < this.historico.length; i++) {
            if(this.historico[i] == null) {
                this.historico[i] = evento;
                break;
            }
        }
    }

}

