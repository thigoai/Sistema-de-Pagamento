import java.util.ArrayList;
import java.util.List;

public class SistemaPagamento {
    private List<Pagamento> pagamentos;

    public SistemaPagamento() {
        pagamentos = new ArrayList<>();
    }

    public void adicionarMetodoPagamento(Pagamento metodo) {
        pagamentos.add(metodo);
        System.out.println("Método de pagamento adicionado: " + metodo.obterDetalhes());
    }

    public void processarPagamento(double valor) {
        for (Pagamento metodo : pagamentos) {
            System.out.println("\nTentando pagamento com: " + metodo.obterDetalhes());
            if (metodo.autorizarPagamento(valor)) {
                metodo.realizarPagamento(valor);
                return; // Pagamento realizado, saímos do loop
            }
        }
        System.out.println("Nenhum método de pagamento disponível pode cobrir o valor de R$" + valor + ".");
    }
}
