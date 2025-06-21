public class ItemPedido {
    private float valor;
    private int quantidade;
    private Produto idProduto;
    private Pedido idPedido;

    

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public ItemPedido(int quantidade, float valor) {
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public ItemPedido() {
        this.quantidade = 0;
        this.valor = 0;
    }
    
}
