// Classe Bicicleta
class Bicicleta extends Veiculo {
    public Bicicleta(String nomeDono) {
        super(nomeDono);
    }

    @Override
    public void listarVerificacoes() {
        System.out.println("Bicicleta: Pneu murcho, necessita de manutenção.");
    }

    @Override
    public void ajustar() {
        System.out.println("Bicicleta: Ajustando bancos e pneus.");
    }

    @Override
    public void limpar() {
        System.out.println("Bicicleta: Limpando...");
    }
}
