public class Som {
    private int volume;

    public Som() {
        this.volume = 5;
    }

    private void equalizarSom() {
        System.out.println("Equalização automática ativada.");
    }

    public void aumentarVolume() {
        if (volume < 10) {
            volume++;
            equalizarSom();
            System.out.println("Volume aumentado para: " + volume);
        } else {
            System.out.println("Volume máximo atingido.");
        }
    }

    public void tocarMusica() {
        System.out.println("Reproduzindo música...");
    }
}