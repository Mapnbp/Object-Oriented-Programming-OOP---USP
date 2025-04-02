import java.time.LocalDate;

class ProdutoPerecivelEspecial extends ProdutoPerecivel {
    public ProdutoPerecivelEspecial(int codigo, double preco, String descricao, int quantidade, LocalDate dataValidade) {
        super(codigo, preco, descricao, quantidade, dataValidade);
    }

    public void imprimirNotaControle() {
        System.out.println("Código: " + getCode() + ", Descrição: " + getDescricao() + ", Quantidade: " + getQtd() + ", Validade: " + getDataValidade());
    }
}
