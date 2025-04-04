class Impressora implements Dispositivo {
    public void ligar() {
        System.out.println("Impressora ligada.");
    }

    public void desligar() {
        System.out.println("Impressora desligada.");
    }

    public int checarStatus() {
        System.out.println("Checando status da impressora...");
        return 3;
    }

    public void calibrar() {
        System.out.println("Calibrando impressora...");
    }
}
