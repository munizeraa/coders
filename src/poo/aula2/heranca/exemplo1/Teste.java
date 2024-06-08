package poo.aula2.heranca.exemplo1;

public class Teste {
    public static void main(String[] args) {
        Carro carroA = new Carro("2020", "UNO", "poiu980");
        carroA.setCor("Lilas");
        carroA.locomover();

        carroA.valorDeMercado = 90;

        Motocicleta moto = new Motocicleta();
        moto.locomover();
    }
}
