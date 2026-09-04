public class SeguradoraAuto extends Seguradora {
    private String nomeSegurado;
    private double valorFipe;
    private int idadeCondutor;
    private int tempoHabilitacao;
    private double coberturaTerceiros;

    public SeguradoraAuto(String nomeSegurado, double valorFipe, int idadeCondutor, int tempoHabilitacao, double coberturaTerceiros) {
        this.nomeSegurado = nomeSegurado;
        this.valorFipe = valorFipe;
        this.idadeCondutor = idadeCondutor;
        this.tempoHabilitacao = tempoHabilitacao;
        this.coberturaTerceiros = coberturaTerceiros;
    }

    @Override
    protected Apolice criarApolice() {
        return new ApoliceAuto(nomeSegurado, valorFipe, idadeCondutor, tempoHabilitacao, coberturaTerceiros);
    }
}