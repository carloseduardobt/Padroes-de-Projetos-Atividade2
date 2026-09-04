public class CheckoutBRFactory implements CheckoutFactory {
    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        return new NotaFiscalBR();
    }

    @Override
    public ProcessadorPagamento criarProcessadorPagamento() {
        return new PagamentoBR();
    }

    @Override
    public EtiquetaEnvio criarEtiquetaEnvio() {
        return new EtiquetaBR();
    }
}