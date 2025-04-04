public class Main {
    public static void main(String[] args) {
        // Uso polimórfico dos dispositivos
        Dispositivo[] dispositivos = {
                new Teclado(),
                new Mouse(),
                new Impressora()
        };

        for (Dispositivo d : dispositivos) {
            d.ligar();
            d.checarStatus();
            d.calibrar();
            d.desligar();
            System.out.println("---------------------------");
        }
    }
}