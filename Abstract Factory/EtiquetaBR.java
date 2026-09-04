public class EtiquetaBR implements EtiquetaEnvio {
    @Override
    public void emitirEtiqueta() {
        System.out.println("Emitindo etiqueta de envio dos Correios [Formato CEP brasileiro].");
    }
}