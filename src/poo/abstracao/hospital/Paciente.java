package poo.abstracao.hospital;

public class Paciente extends Pessoa {

    // Propriedades
    private String acompanhante;
    private String convenioMedico;
    private String historicoFamiliar;

    // Construtor
    public Paciente(String nome, int idade, char sexo) {
        super(nome, idade, sexo);
    }

    public String getAcompanhante() {
        return acompanhante;
    }

    public void setAcompanhante(String acompanhante) {
        this.acompanhante = acompanhante;
    }

    public String getConvenioMedico() {
        return convenioMedico;
    }

    public void setConvenioMedico(String convenioMedico) {
        this.convenioMedico = convenioMedico;
    }

    public String getHistoricoFamiliar() {
        return historicoFamiliar;
    }

    public void setHistoricoFamiliar(String historicoFamiliar) {
        this.historicoFamiliar = historicoFamiliar;
    }
}
