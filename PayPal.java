public class PayPal implements Pagamento {
    private String email;
    private double saldo;

    public PayPal(String email, double saldo) {
        this.email = email;
        this.saldo = saldo;
    }

    @Override
    public boolean autorizarPagamento(double valor) {
        return saldo >= valor;
    }

    @Override
    public void realizarPagamento(double valor) {
        if (autorizarPagamento(valor)) {
            saldo -= valor;
            System.out.println("Pagamento de R$" + valor + " realizado via PayPal.");
        } else {
            System.out.println("Pagamento recusado. Saldo insuficiente.");
        }
    }

    @Override
    public String obterDetalhes() {
        return "PayPal [Email: " + email + ", Saldo: R$" + saldo + "]";
    }
}
