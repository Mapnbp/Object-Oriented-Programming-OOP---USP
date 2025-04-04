abstract class Dispositivo {
    protected String nome;
    protected  boolean ligado;

    public Dispositivo(String nome, boolean ligado) {
        this.nome = nome;
        this.ligado = false;
    }

    public void ligar(){
        ligado = true;
        System.out.println("Ligando...");
    }

    public void desligar(){
        ligado = false;
        System.out.println("Desligando...");
    }

    public boolean estaLigado(){
        return ligado;
    }

    public void status(){
        System.out.println(nome + " esta " + (ligado ? "ligado" : "desligado"));
    }

    public abstract void descricao();
}
