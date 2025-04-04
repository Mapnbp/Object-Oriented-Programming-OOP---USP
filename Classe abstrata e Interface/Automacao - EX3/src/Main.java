import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Dispositivo> dispositivos = new ArrayList<>();

        dispositivos.add(new Lampada("Lampada da Sala", false));
        dispositivos.add(new CaixaSom("Caixa de Som Bluetooth", false ));
        dispositivos.add(new CortinaAutomatica("Cortina da Janela", false));

        // Liga todos os dispositivos
        for (Dispositivo d : dispositivos) {
            d.ligar();
        }

        System.out.println("\n--- Executando comandos por voz ---");

        // Executa comando de voz para dispositivos controláveis
        for (Dispositivo d : dispositivos) {
            if (d instanceof ControlavelPorVoz) {
                ControlavelPorVoz cv = (ControlavelPorVoz) d;

                if (d instanceof CaixaSom) {
                    cv.executarComandoVoz("tocar musica");
                } else if (d instanceof CortinaAutomatica) {
                    cv.executarComandoVoz("abrir");
                    cv.executarComandoVoz("fechar");
                }
            }
        }

        System.out.println("\n--- Status dos dispositivos ---");

        // Mostra status de todos os dispositivos
        for (Dispositivo d : dispositivos) {
            d.status();
        }
    }
}