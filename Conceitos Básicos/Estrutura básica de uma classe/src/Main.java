public class Main {
    public static void main(String[] args) {
        // Criando obj Produto
        Produto produto = new Produto("abacate", 8.50, 13);

        // Info inicial
        produto.exibirInformacoes();

        // Testando
        produto.adicionarEstoque(7);
        produto.exibirInformacoes();

        produto.removerEstoque(3);
        produto.exibirInformacoes();

        produto.removerEstoque(21); //
    }
}