// Classe Automovel
class Automovel extends Veiculo {
    private double quilometragem;
    private float anosDeUso;

    public Automovel(String nomeDono, double quilometragem, float anosDeUso) {
        super(nomeDono);
        this.quilometragem = quilometragem;
        this.anosDeUso = anosDeUso;
    }

    @Override
    public void listarVerificacoes() {
        System.out.println("Automovel: Eh necessario verificar o motor e o oleo.");
    }

    @Override
    public void ajustar() {
        System.out.println("Automovel: Alinhando a direção e ajustando freios.");
    }

    @Override
    public void limpar() {
        System.out.println("Automovel: Limpando...");
    }

    public void trocarOleo() {
        if (anosDeUso > 0 && (quilometragem / anosDeUso) > 100000) {
            System.out.println("Automovel: Oleo foi trocado.");
        } else {
            System.out.println("Automovel: O oleo ainda esta bom.");
        }
    }
}