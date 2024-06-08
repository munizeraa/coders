package poo.abstracao.hospital;

public class TesteHospital {

    public static void main(String[] args) {
        Funcionario atendente1 = new Funcionario("Cassandra", 23, 'F');
        Funcionario atendente2 = new Funcionario("Jobson", 23, 'M');
        Paciente daniel = new Paciente("Daniel", 12, 'M');
        Paciente rafael = new Paciente("Rafael", 12, 'M');

        atendente1.setCargo("Atendente I");
        atendente2.setCargo("Atendente II");

        atendente1.setNome("Regina Volpato");
        atendente1.setNome("SEU CREYSON");

        daniel.setHistoricoFamiliar("Todos tossem quando dormem");
        rafael.setHistoricoFamiliar("Vicio em celular e jogo ruim, e tambem e teimoso");

        System.out.println(daniel.getHistoricoFamiliar());
    }
}
