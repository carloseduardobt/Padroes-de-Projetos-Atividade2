public class PagamentoUS implements ProcessadorPagamento {
    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento via Credit Card / PayPal [USD].");
    }
}