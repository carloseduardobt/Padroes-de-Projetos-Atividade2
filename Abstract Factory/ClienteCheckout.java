public class ClienteCheckout {
    public static void realizadorCheckout(CheckoutFactory fabrica) {
        DocumentoFiscal doc = fabrica.criarDocumentoFiscal();
        ProcessadorPagamento pag = fabrica.criarProcessadorPagamento();
        EtiquetaEnvio etiqueta = fabrica.criarEtiquetaEnvio();

        doc.gerarDocumento();
        pag.processarPagamento();
        etiqueta.emitirEtiqueta();
        System.out.println("--------------------------------------------------");
    }

    public static void main(String[] args) {
        System.out.println("=== CHECKOUT DO BRASIL ===");
        CheckoutFactory fabricaBR = new CheckoutBRFactory();
        realizadorCheckout(fabricaBR);

        System.out.println("=== CHECKOUT DOS ESTADOS UNIDOS ===");
        CheckoutFactory fabricaUS = new CheckoutUSFactory();
        realizadorCheckout(fabricaUS);
    }
}