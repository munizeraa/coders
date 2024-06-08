package poo.interfaces.veiculo;

public interface IPagamento {
    void pagar(double valor, double divida);
}

interface IPagamentoDigital extends IPagamento {
    void pix(double valor, String chave);
}

interface IPagamentoBoleto extends IPagamento {
    void obterDataVencimento(String codigoBoleto);
}