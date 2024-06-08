package lista.exercicios.faccat;

import java.util.Scanner;

public class Exercicio26  {
    public static void main(String[] args) {
        int quantidadeAtual, quantidadeMax, quantidadeMin, quantidadeMedia;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade atual");
        quantidadeAtual = scanner.nextInt();

        System.out.println("Informe a quantidade maxima");
        quantidadeMax = scanner.nextInt();

        System.out.println("Informe a quantidade minima");
        quantidadeMin = scanner.nextInt();

        quantidadeMedia = (quantidadeMax + quantidadeMin) / 2;
        System.out.println("Quantidade Media: " + quantidadeMedia);

        if(quantidadeAtual >= quantidadeMedia) {
            System.out.println("Nao efetuar a compra!!!");
        } else {
            System.out.println("Efetuar a compra!!!");
        }
    }
}
