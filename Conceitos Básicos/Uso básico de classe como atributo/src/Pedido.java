// Esta classe poderia ser otimizada facilmente porem o intuito aqui não eh a potimização do codigo
// eh apenas demonstrar mais uma estrutura basica de classe
public class Pedido {
    private Item itens[];
    private int quantidadeAtual;

    // Construtor definindo o tamanho max do pedido
    public Pedido(int tamanhoMaximo) {
        this.itens = new Item[tamanhoMaximo];
        this.quantidadeAtual = 0;
    }

    public void adicionarItem(Item novoItem) {
        int qtdItemsDoMesmoTipo = 0;

        // Se o item ainda não foi adicionado e há espaço no pedido, adiciona normalmente
        if (quantidadeAtual < itens.length) {

            // Verifica se o item já está no pedido
            for (Item iten : itens) {
                if (iten != null && iten.getNome().equals(novoItem.getNome())) {
                    qtdItemsDoMesmoTipo++;
                }
            }

            if(qtdItemsDoMesmoTipo < novoItem.getQuantidade()) {
                itens[quantidadeAtual] = novoItem;
                quantidadeAtual++;
                System.out.println("Novo item adicionado ao pedido: " + novoItem.getNome());
            } else {
                System.out.println("Não há mais " + novoItem.getNome() + " disponiveis.");
            }
        } else {
            System.out.println("O pedido já atingiu o limite de itens.");
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < quantidadeAtual; i++) {
            total += itens[i].getPrecoUnitario();
        }
        return total;
    }

    public void exibirPedido() {
        System.out.println("\nResumo do Pedido:");
        for (int i = 0; i < quantidadeAtual; i++) {
            System.out.println( itens[i].getNome() +": R$ " + itens[i].getPrecoUnitario());
        }
        System.out.println("Valor Total: R$ " + calcularTotal());
    }
}

