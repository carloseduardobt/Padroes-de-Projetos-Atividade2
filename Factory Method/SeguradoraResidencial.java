public class SeguradoraResidencial extends Seguradora {
    private String nomeSegurado;
    private double valorImovel;
    private boolean isAltoPadrao;
    private boolean possuiEscritura;

    public SeguradoraResidencial(String nomeSegurado, double valorImovel, boolean isAltoPadrao, boolean possuiEscritura) {
        this.nomeSegurado = nomeSegurado;
        this.valorImovel = valorImovel;
        this.isAltoPadrao = isAltoPadrao;
        this.possuiEscritura = possuiEscritura;
    }

    @Override
    protected Apolice criarApolice() {
        return new ApoliceResidencial(nomeSegurado, valorImovel, isAltoPadrao, possuiEscritura);
    }
}