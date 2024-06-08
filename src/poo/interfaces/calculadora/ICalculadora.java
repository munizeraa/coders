package poo.interfaces.calculadora;

public interface ICalculadora {
    // 1. Soma
    double soma(double[] numeros);
    double soma(double numeroA, double numeroB);

    // 2. Subtracao
    double subtracao(double[] numeros);
    double subtracao(double numeroA, double numeroB);

    // 3. Multiplicacao
    double multiplicacao(double[] numeros);
    double multiplicacao(double numeroA, double numeroB);

    // 4. Divisao
    double divisao(double[] numeros);
    double divisao(double numeroA, double numeroB);

    // 5. Potenciacao
    double potenciacao(int[] numeros);

    double potenciacao(int numeroA, int numeroB);

    // 6. Retornar o maior numero entre numeroA e numeroB
    double retornarMaiorEntre(double numeroA, double numeroB);

    // 7. Retornar o maior numero dentro de uma lista de numeros
    double retornarMaiorEntre(double[] numeros);

    // 8. Retornar o menor numero dentro de uma lista de numeros
    double retornarMenorEntre(double numeroA, double numeroB);

    // 9. Fibonnaci de 100
    void fib(int n);
}
