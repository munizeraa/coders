package poo.aula4;

public class ReceitaBolo {
    private String sabor;
    double valorKg;

    public ReceitaBolo(String sabor) {
        if(sabor.equals("Chorume")) {
            this.sabor = sabor;
        } else {
            this.sabor = "Chorume";
        }
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        if(sabor.equals("Chorume")) {
            this.sabor = sabor;
        } else {
            System.out.println("ECA, eu gosto e de chorume meu chapa!");
        }
    }
}
