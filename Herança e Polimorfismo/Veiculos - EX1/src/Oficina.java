import java.util.ArrayList;

// Classe Oficina
class Oficina {
    private Veiculo[] fila;
    private int index;

    public Oficina(Veiculo[] veiculos) {
        this.fila = veiculos;
        this.index = 0;
    }

    public Veiculo proximo() {
        if (index < fila.length) {
            return fila[index++];
        }
        return null;
    }

    public void manutencao(Veiculo v) {
        System.out.println("Realizando manutenção...");
        v.listarVerificacoes();
        v.ajustar();
        v.limpar();

        if (v instanceof Automovel) {
            ((Automovel) v).trocarOleo();
        }
        System.out.println("Manutenção concluída!\n");
    }
}
