package introducao.avaliacao1;

public class ItemDeConstrucao {
    private int quantidade;
    private MaterialDeConstrucao produto;

    public int getQuantidade() {
        return quantidade;
    }

    public MaterialDeConstrucao getProduto() {
        return produto;
    }

    public void setProduto(MaterialDeConstrucao produto) {
        this.produto = produto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
