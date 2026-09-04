public class NotaFiscalBR implements DocumentoFiscal {
    @Override
    public void gerarDocumento() {
        System.out.println("Gerando Nota Fiscal Eletrônica (NF-e) - Padrão Brasil [ICMS, CFOP].");
    }
}