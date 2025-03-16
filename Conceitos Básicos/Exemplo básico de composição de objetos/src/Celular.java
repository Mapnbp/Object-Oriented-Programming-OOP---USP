// Classe Celular
class Celular {
    private Processador processador;
    private Tela tela;
    private Som som;
    private Chamada comunicacao;

    public Celular() {
        this.processador = new Processador();
        this.tela = new Tela();
        this.som = new Som();
        this.comunicacao = new Chamada();
    }

    public void ligarCelular() {
        System.out.println("Ligando o celular...");
        processador.iniciar();
        tela.ligar();
        comunicacao.conectar();
        System.out.println("Celular ligado.");
    }

    public void tocarTela() {
        tela.tocar();
    }

    public void aumentarVolume() {
        som.aumentarVolume();
    }

    public void fazerChamada(String numero) {
        comunicacao.fazerChamada(numero);
    }
}
