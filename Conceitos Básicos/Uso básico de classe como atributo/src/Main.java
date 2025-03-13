public class Main {
    public static void main(String[] args) {
        // Criando um pedido com limite de 5 itens
        Pedido pedido = new Pedido(5);

        // Criando e adicionando itens ao pedido
        pedido.adicionarItem(new Item("Notebook", 3500.00, 1));
        pedido.adicionarItem(new Item("Notebook", 3500.00, 1)); // limite de itens do mesmo tipo
        pedido.adicionarItem(new Item("Mouse", 150.00, 2));
        pedido.adicionarItem(new Item("Mouse", 150.00, 2));
        pedido.adicionarItem(new Item("Mouse", 150.00, 2)); // limite de itens do mesmo tipo
        pedido.adicionarItem(new Item("Teclado", 250.00, 1));
        pedido.adicionarItem(new Item("Headset", 120.00, 1));
        pedido.adicionarItem(new Item("Monitor", 1200.00, 1)); // limite de itens do pedido

        // Exibindo o resumo do pedido
        pedido.exibirPedido();
    }
}
