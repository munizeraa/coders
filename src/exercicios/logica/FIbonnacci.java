package exercicios.logica;

import java.util.Scanner;

public class FIbonnacci {
    public static void main(String[] args) {
        // 1 1 2 3 5 8 13 21
        /*
         * prev = 0
         * next = 1
         *
         * print -> next -> 1
         *
         * next = prev + next = 1
         * prev = next - prev = 1
         *
         *
         * print -> next -> 1
         *
         * next = 1 + 1 = 2
         * prev = 2 - 1 = 1
         *
         * print -> next -> 2
         *
         * next = 2 + 1 -> 3
         * prev = 3 - 1 -> 2
         *
         * print -> next -> 3
         *
         * next = 3 + 2 -> 5
         * prev = 5 - 2 -> 3
         *
         * print -> next -> 5
         *
         * next = 5 + 3 -> 8
         * prev = 8 - 3 -> 5
         *
         * print -> next -> 8
         *
         * e por ai vaai,,,
         *
         */

        int prev = 0;
        int next = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Numero a ser calculado: ");
        int n = scanner.nextInt();

        fibonnaci(n, prev, next);
    }

    static void fibonnaci(int n, int prev, int next) {

        while(next < n) {
            System.out.print(next + " ");

            next = next + prev;
            prev = next - prev;
        }
    }
}
