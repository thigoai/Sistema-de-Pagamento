public interface Pagamento {
    boolean autorizarPagamento(double valor);
    void realizarPagamento(double valor);
    String obterDetalhes();
}
