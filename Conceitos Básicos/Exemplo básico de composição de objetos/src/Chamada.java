// Classe SistemaComunicacao
class Chamada {
    private boolean conectado;

    public Chamada() {
        this.conectado = false;
    }

    private void verificarSinal() {
        System.out.println("Verificando intensidade do sinal...");
    }

    public void conectar() {
        this.conectado = true;
        verificarSinal();
        System.out.println("Sistema de comunicação conectado.");
    }

    public void fazerChamada(String numero) {
        if (conectado) {
            System.out.println("Chamando " + numero + "...");
        } else {
            System.out.println("Sem conexão. Não é possível fazer a chamada.");
        }
    }
}
