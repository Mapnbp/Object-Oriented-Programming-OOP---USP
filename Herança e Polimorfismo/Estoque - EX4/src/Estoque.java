import java.util.ArrayList;
import java.util.List;

class Estoque {
    private List<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    public void cadastrarProduto(Produto produto) {
        produtos.add(produto);
    }

    public Produto consultarProduto(int codigo) {
        for (Produto p : produtos) {
            if (p.getCode() == codigo) {
                return p;
            }
        }
        return null;
    }

    public double calcularCustoTotal() {
        double total = 0;
        for (Produto p : produtos) {
            total += p.getPrecoU() * p.getQtd();
        }
        return total;
    }

    public void listarProdutos() {
        for (Produto p : produtos) {
            p.imprimirDescricao();
        }
    }
}