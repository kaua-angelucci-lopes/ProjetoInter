public class Produto {
    private int idProduto;
    private String descricao;
    private String imagem;
    private float preco;
    private int estoque;


    public int getIdProduto() {
        return idProduto;
    }
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getImagem() {
        return imagem;
    }
    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public int getEstoque() {
        return estoque;
    }
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    public Produto(int idProduto, String descricao, String imagem, float preco, int estoque) {
        this.idProduto = idProduto;
        this.descricao = descricao;
        this.imagem = imagem;
        this.preco = preco;
        this.estoque = estoque;
    }
    
    public Produto() {
        this.idProduto = 0;
        this.descricao = "Sem descrição";
        this.imagem = "Sem imagem";
        this.preco = 0;
        this.estoque = 0;
    }
}
