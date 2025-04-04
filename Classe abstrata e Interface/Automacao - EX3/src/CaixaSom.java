class CaixaSom extends Dispositivo implements ControlavelPorVoz {

    public CaixaSom(String nome, boolean ligado) {
        super(nome, ligado);
    }

    @Override
    public void executarComandoVoz(String comando) {
        if (ligado && comando.equalsIgnoreCase("tocar musica")) {
            System.out.println("Musica tocando...");
        } else {
            System.out.println("Caixa desligada ou comando invalido.");
        }
    }

    @Override
    public void descricao() {
        System.out.println("Uma caixa de som com controle por voz.");
    }
}