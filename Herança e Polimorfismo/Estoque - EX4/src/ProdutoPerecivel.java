import java.time.LocalDate;

class ProdutoPerecivel extends Produto {
    private LocalDate dataValidade;

    public ProdutoPerecivel(int codigo, double preco, String descricao, int quantidade, LocalDate dataValidade) {
        super(codigo, preco, descricao, quantidade);
        this.dataValidade = dataValidade;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public int retirar(int quantidade, LocalDate dataAtual) {
        if (dataValidade.isBefore(dataAtual.plusDays(30))) {
            this.qtd = 0;
            return 0;
        }
        return super.retirar(quantidade);
    }

    public boolean adicionarEstoque(int quantidade) {
        if (this.qtd == 0) {
            this.qtd = quantidade;
            return true;
        }
        return false;
    }
}