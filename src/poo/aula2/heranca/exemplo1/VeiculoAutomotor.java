package poo.aula2.heranca.exemplo1;

public abstract class VeiculoAutomotor extends  Veiculo {
    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private String ano;
    private int quantidadeDeRodas;
    private int quantidadeDePassageiros;
    private String tipoDeCombustivel;
    int valorDeMercado;

    // Getters e Setters

    public String getMarca() {
        if (this.ano.length() > 10) {
            return marca;
        } else {
            return "Acesso Negado";
        }

    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public int getQuantidadeDeRodas() {
        return quantidadeDeRodas;
    }

    public void setQuantidadeDeRodas(int quantidadeDeRodas) {
        this.quantidadeDeRodas = quantidadeDeRodas;
    }

    public int getQuantidadeDePassageiros() {
        return quantidadeDePassageiros;
    }

    public void setQuantidadeDePassageiros(int quantidadeDePassageiros) {
        this.quantidadeDePassageiros = quantidadeDePassageiros;
    }

    public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

    public void setTipoDeCombustivel(String tipoDeCombustivel) {
        this.tipoDeCombustivel = tipoDeCombustivel;
    }
}
