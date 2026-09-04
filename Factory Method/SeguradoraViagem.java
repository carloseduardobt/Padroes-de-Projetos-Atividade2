public class SeguradoraViagem extends Seguradora {
    private String nomeSegurado;
    private int diasViagem;
    private boolean isInternacional;
    private double coberturaAssistenciaMedica;
    private boolean possuiPassaporte;

    public SeguradoraViagem(String nomeSegurado, int diasViagem, boolean isInternacional, double coberturaAssistenciaMedica, boolean possuiPassaporte) {
        this.nomeSegurado = nomeSegurado;
        this.diasViagem = diasViagem;
        this.isInternacional = isInternacional;
        this.coberturaAssistenciaMedica = coberturaAssistenciaMedica;
        this.possuiPassaporte = possuiPassaporte;
    }

    @Override
    protected Apolice criarApolice() {
        return new ApoliceViagem(nomeSegurado, diasViagem, isInternacional, coberturaAssistenciaMedica, possuiPassaporte);
    }
}