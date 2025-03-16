// Classe Processador
class Processador {
    private boolean emExecucao;

    public Processador() {
        this.emExecucao = false;
    }

    private void otimizarProcessos() {
        System.out.println("Otimização de processos em andamento...");
    }

    public void iniciar() {
        this.emExecucao = true;
        otimizarProcessos();
        System.out.println("Processador ligado.");
    }

    public void desligar() {
        this.emExecucao = false;
        System.out.println("Processador desligado.");
    }
}
