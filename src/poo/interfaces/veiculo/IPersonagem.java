package poo.interfaces.veiculo;

public interface IPersonagem extends IVeiculo {
    void irParaFrente();
    void irParaTras();
    void pular();
    void agachar();
    void socoBaixo();
    void socoAlto();
    void chuteBaixo();
    void chuteAlto();

    @Override
    void locomover();
}
