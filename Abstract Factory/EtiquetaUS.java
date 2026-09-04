public class EtiquetaUS implements EtiquetaEnvio {
    @Override
    public void emitirEtiqueta() {
        System.out.println("Emitindo etiqueta de envio FedEx / UPS [Formato ZIP Code].");
    }
}