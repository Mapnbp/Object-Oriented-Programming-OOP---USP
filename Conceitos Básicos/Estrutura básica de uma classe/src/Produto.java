class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    // Construcao
    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void exibirInformacoes() {
        System.out.println("Produto: " + nome);
        System.out.println("Preco: RS " + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
    }

    // Adicao
    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            quantidadeEmEstoque += quantidade;
            System.out.println(quantidade + " unidades adicionadas ao estoque.");
        } else {
            System.out.println("Quantidade invalida para adicao.");
        }
    }

    // Remocao
    public void removerEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= quantidadeEmEstoque) {
            quantidadeEmEstoque -= quantidade;
            System.out.println(quantidade + " unidades removidas do estoque.");
        } else {
            System.out.println("Quantidade invalida ou insuficiente para remocao.");
        }
    }

}
