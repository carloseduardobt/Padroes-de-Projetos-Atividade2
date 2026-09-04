public class SeguradoraVida extends Seguradora {
    private String nomeSegurado;
    private int idade;
    private double capitalSegurado;
    private boolean isFumante;
    private boolean possuiAtestadoMedico;

    public SeguradoraVida(String nomeSegurado, int idade, double capitalSegurado, boolean isFumante, boolean possuiAtestadoMedico) {
        this.nomeSegurado = nomeSegurado;
        this.idade = idade;
        this.capitalSegurado = capitalSegurado;
        this.isFumante = isFumante;
        this.possuiAtestadoMedico = possuiAtestadoMedico;
    }

    @Override
    protected Apolice criarApolice() {
        return new ApoliceVida(nomeSegurado, idade, capitalSegurado, isFumante, possuiAtestadoMedico);
    }
}