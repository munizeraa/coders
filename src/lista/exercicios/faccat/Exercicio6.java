package lista.exercicios.faccat;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        double base, altura, area;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Base: ");
        base = scanner.nextDouble();

        System.out.println("Altura: ");
        altura = scanner.nextDouble();

        area = base * altura;
        System.out.printf("\nArea: %.2f", area);

        System.out.println();

    }
}
