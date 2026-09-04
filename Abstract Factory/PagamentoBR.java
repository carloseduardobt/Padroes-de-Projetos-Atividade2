public class PagamentoBR implements ProcessadorPagamento {
    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento via Pix / Boleto com 5% de desconto.");
    }
}