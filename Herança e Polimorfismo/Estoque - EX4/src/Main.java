import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        LocalDate hoje = LocalDate.now();

        Produto leite = new ProdutoPerecivel(1, 5.0, "Leite", 20, LocalDate.of(2025, 12, 1));
        ProdutoPerecivelEspecial carne = new ProdutoPerecivelEspecial(2, 25.0, "Carne", 10, LocalDate.of(2025, 11, 15));
        ProdutoNaoPerecivel panela = new ProdutoNaoPerecivel(3, 50.0, "Panela", 5, 2);

        estoque.cadastrarProduto(leite);
        estoque.cadastrarProduto(carne);
        estoque.cadastrarProduto(panela);

        System.out.println("\n--- Testando Retirada de Produto Perecível ---");
        System.out.println("Quantidade antes da retirada: " + leite.getQtd());
        ((ProdutoPerecivel) leite).retirar(5, hoje);
        System.out.println("Quantidade após retirada: " + leite.getQtd());

        System.out.println("\n--- Testando Acréscimo ao Estoque de Produto Perecível ---");
        boolean sucesso = ((ProdutoPerecivel) leite).adicionarEstoque(10);
        System.out.println("Acréscimo realizado: " + sucesso);

        System.out.println("\n--- Testando Impressão de Nota de Controle ---");
        carne.imprimirNotaControle();

        System.out.println("\nCusto total do estoque: R$ " + estoque.calcularCustoTotal());
        estoque.listarProdutos();
    }
}