class ProdutoNaoPerecivel extends Produto {
    private final int garantia;

    public ProdutoNaoPerecivel(int codigo, double preco, String descricao, int quantidade, int garantia) {
        super(codigo, preco, descricao, quantidade);
        this.garantia = garantia;
    }

    public int getGarantia() {
        return garantia;
    }
}
