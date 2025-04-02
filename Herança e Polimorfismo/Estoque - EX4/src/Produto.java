public class Produto {
    protected int code;
    protected double precoU;
    protected String descricao;
    protected int qtd;

    public Produto(int codigo, double preco, String descricao, int quantidade) {
        this.code = codigo;
        this.precoU = preco;
        this.descricao = descricao;
        this.qtd = quantidade;
    }

    public double getPrecoU() {
        return precoU;
    }

    public void setPrecoU(double precoU) {
        this.precoU = precoU;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCode() {
        return code;
    }

    public int getQtd() {
        return qtd;
    }

    public int retirar(int quantidade) {
        int retirado = Math.min(this.qtd, quantidade);
        this.qtd -= retirado;
        return retirado;
    }

    public void adicionar(int quantidade) {
        this.qtd += quantidade;
    }

    public void imprimirDescricao() {
        System.out.println("Produto " + code + ", " + descricao + ", custo de R$ " + precoU + ", quantidade " + qtd);
    }
}