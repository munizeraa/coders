package exercicios.logica;

import java.util.Random;

public class Teimosia {
    public static void main(String[] args) {
        String[] palavras = {
                "Agora que eu to mandando",
                "Ninguem manda em mim",
                "Vou te processar",
                "Por favor",
                "Meu corpo minhas regras",
                "Vou xingar no Twitter"
        };

        System.out.println(pedirAosPais(0, palavras));
    }

    static int pedirAosPais(int numeroDeTentativas, String[] palavras) {
        Random random = new Random();
        int index = random.nextInt(palavras.length);

        if (palavras[index].equals("Por favor")) {
            System.out.println("ATE QUE ENFIM MEU AMIGO!!!!");
            System.out.println("Voce pediu " + numeroDeTentativas + " vezes!!!");
            return numeroDeTentativas;
        } else {
            numeroDeTentativas++;
            return pedirAosPais(numeroDeTentativas, palavras);
        }
    }
}
