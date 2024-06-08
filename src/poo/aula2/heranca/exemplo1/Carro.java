package poo.aula2.heranca.exemplo1;

public class Carro extends VeiculoAutomotor {

    public Carro(String ano, String modelo, String placa) {
        this.setAno(ano);
        this.setModelo(modelo);
        this.setPlaca(placa);
    }

    // Metodos ou Comportamentos
    @Override
    void locomover() {
        super.locomover();
        System.out.println("VRUUUUUM");
    }
}
