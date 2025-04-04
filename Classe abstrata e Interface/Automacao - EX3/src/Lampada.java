class Lampada extends Dispositivo {

    public Lampada(String nome, boolean ligado) {
        super(nome, ligado);
    }

    @Override
    public void descricao() {
        System.out.println("Uma lampada que pode ser ligada ou desligada manualmente.");
    }
}