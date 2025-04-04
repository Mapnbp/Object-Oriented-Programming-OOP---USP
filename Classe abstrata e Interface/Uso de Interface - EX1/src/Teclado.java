class Teclado implements Dispositivo {
    public void ligar() {
        System.out.println("Teclado ligado.");
    }

    public void desligar() {
        System.out.println("Teclado desligado.");
    }

    public int checarStatus() {
        System.out.println("Checando status do teclado...");
        return 1; // status de exemplo
    }

    public void calibrar() {
        System.out.println("Calibrando teclado...");
    }
}
