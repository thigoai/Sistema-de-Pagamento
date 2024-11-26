public class PagamentoApp {
    public static void main(String[] args) {
        SistemaPagamento sistema = new SistemaPagamento();

        // Adicionando métodos de pagamento
        sistema.adicionarMetodoPagamento(new CartaoDeCredito("1234-5678-9876-5432", "João Silva", 500));
        sistema.adicionarMetodoPagamento(new PayPal("joao@email.com", 200));
        sistema.adicionarMetodoPagamento(new BoletoBancario("00190500954014481606906809350314337370000000100"));

        // Tentando processar pagamentos
        System.out.println("\n### Tentativa 1: Pagamento de R$150 ###");
        sistema.processarPagamento(150);

        System.out.println("\n### Tentativa 2: Pagamento de R$400 ###");
        sistema.processarPagamento(400);

        System.out.println("\n### Tentativa 3: Pagamento de R$100 ###");
        sistema.processarPagamento(100);
    }
}
