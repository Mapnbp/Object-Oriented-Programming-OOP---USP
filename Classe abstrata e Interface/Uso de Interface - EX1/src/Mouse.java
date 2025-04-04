class Mouse implements Dispositivo {
    public void ligar() {
        System.out.println("Mouse ligado.");
    }

    public void desligar() {
        System.out.println("Mouse desligado.");
    }

    public int checarStatus() {
        System.out.println("Checando status do mouse...");
        return 2;
    }

    public void calibrar() {
        System.out.println("Calibrando mouse...");
    }
}