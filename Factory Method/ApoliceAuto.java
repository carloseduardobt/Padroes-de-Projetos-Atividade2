import java.time.LocalDate;

public class ApoliceAuto extends Apolice {
    private double valorFipe;
    private int idadeCondutor;
    private int tempoHabilitacao;
    private double coberturaTerceiros;

    public ApoliceAuto(String nomeSegurado, double valorFipe, int idadeCondutor, int tempoHabilitacao, double coberturaTerceiros) {
        this.numero = "AUTO-" + System.currentTimeMillis();
        this.nomeSegurado = nomeSegurado;
        this.dataEmissao = LocalDate.now();
        this.valorFipe = valorFipe;
        this.idadeCondutor = idadeCondutor;
        this.tempoHabilitacao = tempoHabilitacao;
        this.coberturaTerceiros = coberturaTerceiros;
    }

    @Override
    public double calcularPremio() {
        double premioAnual = valorFipe * 0.08;
        if (idadeCondutor < 25) premioAnual *= 1.30;
        if (tempoHabilitacao < 2) premioAnual *= 1.20;
        return premioAnual / 12;
    }

    @Override
    public boolean validarCobertura() {
        return coberturaTerceiros >= 50000.00;
    }

    @Override
    public String listarDocumentos() {
        return "CNH, CRLV e comprovante de residência";
    }
}