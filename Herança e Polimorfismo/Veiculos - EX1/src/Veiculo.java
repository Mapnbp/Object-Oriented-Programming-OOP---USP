// Classe base Veiculo
public class Veiculo {
    private String nomeDono;

    public Veiculo(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public void listarVerificacoes() {
        System.out.println(nomeDono + ": Eh necessario verificar...");
    }

    public void ajustar() {
        System.out.println(nomeDono + ": Ajustando...");
    }

    public void limpar() {
        System.out.println(nomeDono + ": Limpando...");
    }
}
