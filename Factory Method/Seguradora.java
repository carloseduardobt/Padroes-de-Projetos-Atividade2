public abstract class Seguradora {
    protected abstract Apolice criarApolice();

    public final void processarContratacao() {
        Apolice apolice = criarApolice();
        
        System.out.println("Processando solicitação para o segurado: " + apolice.nomeSegurado);
        if (apolice.validarCobertura()) {
            System.out.println("Status: CONTRATAÇÃO APROVADA!");
            System.out.println(apolice.gerarResumo());
        } else {
            System.out.println("Status: CONTRATAÇÃO REJEITADA (Validações mínimas não atendidas).\n");
        }
    }
}