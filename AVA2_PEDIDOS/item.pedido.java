public class ItemPedido {
    private String codigoProduto;
    private String descricao;
    private int quantidade;
    private double precoUnitario;

    public ItemPedido(String codigoProduto, String descricao, int quantidade, double precoUnitario) {
        this.codigoProduto = codigoProduto;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public double calcularSubtotal() {
        return quantidade * precoUnitario;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }
}
