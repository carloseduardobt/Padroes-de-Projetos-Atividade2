import java.time.LocalDate;

public class ApoliceResidencial extends Apolice {
    private double valorImovel;
    private boolean isAltoPadrao;
    private boolean possuiEscrituraOuContrato;

    public ApoliceResidencial(String nomeSegurado, double valorImovel, boolean isAltoPadrao, boolean possuiEscrituraOuContrato) {
        this.numero = "RES-" + System.currentTimeMillis();
        this.nomeSegurado = nomeSegurado;
        this.dataEmissao = LocalDate.now();
        this.valorImovel = valorImovel;
        this.isAltoPadrao = isAltoPadrao;
        this.possuiEscrituraOuContrato = possuiEscrituraOuContrato;
    }

    @Override
    public double calcularPremio() {
        double premioAnual = valorImovel * 0.015;
        if (isAltoPadrao) premioAnual *= 1.25;
        return premioAnual / 12;
    }

    @Override
    public boolean validarCobertura() {
        return possuiEscrituraOuContrato;
    }

    @Override
    public String listarDocumentos() {
        return "Escritura ou contrato de locação e comprovante de residência";
    }
}