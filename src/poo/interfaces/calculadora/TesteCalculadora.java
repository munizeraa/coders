package poo.interfaces.calculadora;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        double resultado = 0;

//        resultado = calc.soma(new double[] {10, 7, 34, 56, 67, 78, 90});
//        System.out.println(resultado);
//
//        resultado = calc.subtracao(new double[] {12, 45, 33});
//        System.out.println(resultado);

//        resultado = calc.multiplicacao(new double[] {12, 45, 33});
//        System.out.printf(String.format("%.2f", resultado));
//
//        resultado = calc.divisao(new double[] {12, 45, 33});
//        System.out.printf(String.format("\n %.4f", resultado));

//        resultado = calc.potenciacao(new int[] {12, 4, 3});
//        System.out.println(resultado);

//        resultado = calc.retornarMaiorEntre(new double[] {120445, 4, 9098, 56, 2999});
//        System.out.println(resultado);

        calc.fib(100);
    }
}
