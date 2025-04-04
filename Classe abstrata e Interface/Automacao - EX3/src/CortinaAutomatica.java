class CortinaAutomatica extends Dispositivo implements ControlavelPorVoz {

    public CortinaAutomatica(String nome, boolean ligado) {
        super(nome, ligado);
    }

    @Override
    public void executarComandoVoz(String comando) {
        if (!ligado) {
            System.out.println("Cortina desligada ou comando invalido.");
            return;
        }

        switch (comando.toLowerCase()) {
            case "abrir":
                System.out.println("Cortina abrindo...");
                break;
            case "fechar":
                System.out.println("Cortina fechando...");
                break;
            default:
                System.out.println("Cortina desligada ou comando inválido.");
        }
    }

    @Override
    public void descricao() {
        System.out.println("Uma cortina automatica com controle por voz.");
    }
}
