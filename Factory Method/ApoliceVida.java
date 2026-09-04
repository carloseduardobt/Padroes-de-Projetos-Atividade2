import java.time.LocalDate;

public class ApoliceVida extends Apolice {
    private int idade;
    private double capitalSegurado;
    private boolean isFumante;
    private boolean possuiAtestadoMedico;

    public ApoliceVida(String nomeSegurado, int idade, double capitalSegurado, boolean isFumante, boolean possuiAtestadoMedico) {
        this.numero = "VID-" + System.currentTimeMillis();
        this.nomeSegurado = nomeSegurado;
        this.dataEmissao = LocalDate.now();
        this.idade = idade;
        this.capitalSegurado = capitalSegurado;
        this.isFumante = isFumante;
        this.possuiAtestadoMedico = possuiAtestadoMedico;
    }

    @Override
    public double calcularPremio() {
        double premioMensal = (idade * 12) + (capitalSegurado * 0.002);
        if (isFumante) premioMensal *= 1.50;
        return premioMensal;
    }

    @Override
    public boolean validarCobertura() {
        if (capitalSegurado > 500000.00 && !possuiAtestadoMedico) {
            return false;
        }
        return true;
    }

    @Override
    public String listarDocumentos() {
        return "Documento de identidade, CPF" + (capitalSegurado > 500000.00 ? " e Atestado médico" : "");
    }
}