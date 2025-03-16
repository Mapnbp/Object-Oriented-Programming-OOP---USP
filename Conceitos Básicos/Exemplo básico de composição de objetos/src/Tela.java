class Tela {
    private boolean ligada;

    public Tela() {
        this.ligada = false;
    }

    private void ajustarBrilho() {
        System.out.println("Ajustando brilho automaticamente...");
    }

    public void ligar() {
        this.ligada = true;
        ajustarBrilho();
        System.out.println("Tela ligada.");
    }

    public void tocar() {
        if (ligada) {
            System.out.println("Tela detectou um toque.");
        } else {
            System.out.println("A tela está desligada.");
        }
    }
}