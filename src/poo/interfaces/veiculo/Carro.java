package poo.interfaces.veiculo;

public class Carro implements IVeiculo {
    String ano;
    String marca;
    String modelo;

    @Override
    public void locomover() { }

    @Override
    public String locomover(String partida, String destino) {
        return String.format("Locomovendo de %s para %s", partida, destino);
    }
}
