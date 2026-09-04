import java.time.LocalDate;

public abstract class Apolice {
    public String numero;
    public String nomeSegurado;
    public LocalDate dataEmissao;

    public abstract double calcularPremio();
    public abstract boolean validarCobertura();
    public abstract String listarDocumentos();

    public String gerarResumo() {
        return "Apólice: " + numero + 
               "\nSegurado: " + nomeSegurado + 
               "\nData de Emissão: " + dataEmissao +
               "\nPrêmio Calculado: R$ " + String.format("%.2f", calcularPremio()) + 
               "\nDocumentos Exigidos: " + listarDocumentos() + "\n";
    }
}