package exercicios.logica;

import java.util.ArrayList;
import java.util.Arrays;

public class OrdenacaoLista {
    public static void main(String[] args) {
        int[] numeros = { 10, 20, 44, 2, -1, 0, 28, 76, 33, 55, 88, 101, 98 };
        int[] pares = new int [0];
        int[] impares = new int[0];

        for(int i = 0; i < numeros.length; i++) {
            if(numeros[i] % 2 == 0) {
                pares = addItem(numeros[i], pares);
            } else {
                impares = addItem(numeros[i], impares);
            }
        }

        System.out.println("Impares: ");
        for (int par : pares) {
            System.out.println(par);
        }

        System.out.println("\n\n\n\n\nPares: ");
        for (int impar : impares) {
            System.out.println(impar);
        }


//        System.out.println("\n\n\n\n TODOS");
//        Arrays.stream(numeros).forEach(n -> {
//            System.out.println(n);
//        });
//
        ArrayList<Integer> values = new ArrayList<Integer>();
        values.add(90);
        values.add(90);
        values.add(90);
        values.add(90);
        values.add(90);

    }

    static int[] addItem(int numero, int[] lista) {
        int limite = lista.length + 1;
        int[] novaLista = new int[limite];

        // Backup
        for(int i = 0; i < lista.length; i++) {
            novaLista[i] = lista[i];
        }

        novaLista[limite - 1] = numero;

        return novaLista;
    }
}
