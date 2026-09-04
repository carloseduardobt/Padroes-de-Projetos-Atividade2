public class CheckoutUSFactory implements CheckoutFactory {
    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        return new NotaFiscalUS();
    }

    @Override
    public ProcessadorPagamento criarProcessadorPagamento() {
        return new PagamentoUS();
    }

    @Override
    public EtiquetaEnvio criarEtiquetaEnvio() {
        return new EtiquetaUS();
    }
}