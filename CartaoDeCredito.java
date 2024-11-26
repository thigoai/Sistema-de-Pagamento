public class CartaoDeCredito implements Pagamento {
    private String numeroCartao;
    private String nomeTitular;
    private double limiteDisponivel;

    public CartaoDeCredito(String numeroCartao, String nomeTitular, double limiteDisponivel) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.limiteDisponivel = limiteDisponivel;
    }

    @Override
    public boolean autorizarPagamento(double valor) {
        return limiteDisponivel >= valor;
    }

    @Override
    public void realizarPagamento(double valor) {
        if (autorizarPagamento(valor)) {
            limiteDisponivel -= valor;
            System.out.println("Pagamento de R$" + valor + " realizado com cartão de crédito.");
        } else {
            System.out.println("Pagamento recusado. Limite insuficiente.");
        }
    }

    @Override
    public String obterDetalhes() {
        return "Cartão de Crédito [Titular: " + nomeTitular + ", Limite Disponível: R$" + limiteDisponivel + "]";
    }
}
