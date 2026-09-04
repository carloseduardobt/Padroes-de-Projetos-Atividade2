public class NotaFiscalUS implements DocumentoFiscal {
    @Override
    public void gerarDocumento() {
        System.out.println("Gerando Sales Invoice - Padrão Estados Unidos [State Tax].");
    }
}