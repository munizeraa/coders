package exercicios.logica;

public class Fatorial {
    public static void main(String[] args) {
        System.out.println(fat(200));
    }

    public static int fat(int n) {
        if(n > 1) {
            return n * fat(n - 1);
        } else {
            return n;
        }
    }
}

/*
    n * f(n - 1)    --> 5 * f(4)    20
    n * f(n - 1)    --> 4 * f(3)    12
    n * f(n - 1)    --> 3 * f(2)    6
    n * f(n - 1)    --> 2 * f(1)    2

    12
 */