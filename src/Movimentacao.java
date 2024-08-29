public interface Movimentacao {

    // Interface da Movimentacao entre Contas Bancarias

    void transferir(ContaBancaria destino, double valor);
}