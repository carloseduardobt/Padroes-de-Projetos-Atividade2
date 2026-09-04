public class Cliente {
    public static void main(String[] args) {
        System.out.println("--- INICIANDO EMISSÕES DE APÓLICE ---\n");

        Seguradora auto = new SeguradoraAuto("João Silva", 60000.00, 30, 5, 55000.00);
        auto.processarContratacao();

        Seguradora residencial = new SeguradoraResidencial("Maria Souza", 400000.00, false, false);
        residencial.processarContratacao();

        Seguradora vida = new SeguradoraVida("Carlos Pereira", 45, 600000.00, true, true);
        vida.processarContratacao();

        Seguradora viagem = new SeguradoraViagem("Ana Costa", 10, true, 50000.00, false);
        viagem.processarContratacao();
    }
    
}
