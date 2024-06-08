package poo.abstracao.hospital;

public class Funcionario extends Pessoa {

    // Propriedades
    private String matricula;
    private String cargo;
    private double salario;

    // Construtor
    public Funcionario(String nome, int idade, char sexo) {
        super(nome, idade, sexo);
    }

    // Comportamentos
    void baterPonto(String horario) {
        System.out.println(horario);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
