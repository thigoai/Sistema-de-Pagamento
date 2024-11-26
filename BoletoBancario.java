public class BoletoBancario implements Pagamento {
    private String codigoBarras;

    public BoletoBancario(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @Override
    public boolean autorizarPagamento(double valor) {
        // Para boletos, sempre retorna true (autorização é feita externamente)
        return true;
    }

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Boleto gerado no valor de R$" + valor + ". Código de barras: " + codigoBarras);
    }

    @Override
    public String obterDetalhes() {
        return "Boleto [Código de Barras: " + codigoBarras + "]";
    }
}
