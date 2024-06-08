package poo.interfaces.calculadora;

import java.util.Arrays;

public class Calculadora implements ICalculadora {

    @Override
    public double soma(double numeroA, double numeroB) {
        return numeroA + numeroB;
    }

    @Override
    public double soma(double[] numeros) {
        double soma = 0;

        for(double numero : numeros) {
            soma += numero;
        }

        return soma;
    }

    @Override
    public double subtracao(double numeroA, double numeroB) {
        return numeroA - numeroB;
    }

    @Override
    public double subtracao(double[] numeros) {
        double subtracao = 0;

        /**
         * Verificando se a lista esta vazia para poder obter o primeiro elemento
         */
        if(numeros.length > 0) {
            subtracao = numeros[0];

            for(int i = 0; i < numeros.length; i++) {
                int proximo = i + 1;

                if(proximo < numeros.length) {
                    subtracao -= numeros[proximo];
                }
            }
        }

        return subtracao;
    }

    @Override
    public double multiplicacao(double[] numeros) {
        double multiplicacao = 0;

        if(numeros.length > 0) {
            multiplicacao = numeros[0];

            for(int i = 0; i < numeros.length; i++) {
                int proximo = i + 1;

                if(proximo < numeros.length) {
                    multiplicacao *= numeros[proximo];
                }
            }
        }

        return multiplicacao;
    }

    @Override
    public double multiplicacao(double numeroA, double numeroB) {
        return numeroA * numeroB;
    }

    @Override
    public double divisao(double[] numeros) {
        double divisao = 0;

        if(numeros.length > 0) {
            divisao = numeros[0];

            for(int i = 0; i < numeros.length; i++) {
                int proximo = i + 1;

                if(proximo < numeros.length) {
                    divisao /= numeros[proximo];
                }
            }
        }
        return divisao;
    }

    @Override
    public double divisao(double numeroA, double numeroB) {
        return numeroA / numeroB;
    }

    @Override
    public double potenciacao(int[] numeros) {
        double potenciacao = 0;

        if(numeros.length > 0) {
            potenciacao = numeros[0];

            for(int i = 0; i < numeros.length; i++) {
                int proximo = i + 1;

                if(proximo < numeros.length) {
                    potenciacao = Math.pow(potenciacao, numeros[proximo]);
                }
            }
        }

        return potenciacao;
    }

    @Override
    public double potenciacao(int numeroA, int numeroB) {
        return Math.pow(numeroA, numeroB);
    }

    @Override
    public double retornarMaiorEntre(double numeroA, double numeroB) {
        // condicao ? true : false
//        return (numeroA > numeroB) ? numeroA : numeroB;

        if (numeroA > numeroB) {
            return numeroA;
        } else {
            return numeroB;
        }
    }

    @Override
    public double retornarMaiorEntre(double[] numeros) {
        double maior = 0;

//        for(int i = 0; i < numeros.length; i++) {
//            if(numeros[i] > maior) {
//                maior = numeros[i];
//            }
//        }

        for(double n : numeros) {
            if(n > maior) {
                maior = n;
            }
        }

        return maior;
    }

    @Override
    public double retornarMenorEntre(double numeroA, double numeroB) {
        return 0;
    }


    @Override
    public void fib(int n) {
        int next = 1;
        int prev = 0;

        while(next < n) {
            System.out.println(next);
            next = next + prev;
            prev = next - prev;
        }
    }
}
