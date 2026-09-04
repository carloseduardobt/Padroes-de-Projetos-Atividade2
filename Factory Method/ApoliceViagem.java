import java.time.LocalDate;

public class ApoliceViagem extends Apolice {
    private int diasViagem;
    private boolean isInternacional;
    private double coberturaAssistenciaMedica;
    private boolean possuiPassaporte;

    public ApoliceViagem(String nomeSegurado, int diasViagem, boolean isInternacional, double coberturaAssistenciaMedica, boolean possuiPassaporte) {
        this.numero = "VIA-" + System.currentTimeMillis();
        this.nomeSegurado = nomeSegurado;
        this.dataEmissao = LocalDate.now();
        this.diasViagem = diasViagem;
        this.isInternacional = isInternacional;
        this.coberturaAssistenciaMedica = coberturaAssistenciaMedica;
        this.possuiPassaporte = possuiPassaporte;
    }

    @Override
    public double calcularPremio() {
        double premio = diasViagem * 15.00;
        if (isInternacional) premio += 100.00;
        return premio;
    }

    @Override
    public boolean validarCobertura() {
        if (isInternacional) {
            return coberturaAssistenciaMedica >= 30000.00 && possuiPassaporte; 
        }
        return true;
    }

    @Override
    public String listarDocumentos() {
        return "Itinerário de viagem" + (isInternacional ? " e Passaporte" : "");
    }
}