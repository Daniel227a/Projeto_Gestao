public class Pedidos
{
    private int numero_produto;
    private float valor_produto;
    private String nome_produto;
    private int quantidade_produto;

    public String getArea_destina() {
        return area_destina;
    }

    public void setArea_destina(String area_destina) {
        this.area_destina = area_destina;
    }

    private String area_destina;


    public void setNumero_produto(int numero_produto) {
        this.numero_produto = numero_produto;
    }

    public void setValor_produto(float valor_produto) {
        this.valor_produto = valor_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public void setQuantidade_produto(int quantidade_produto) {
        this.quantidade_produto = quantidade_produto;
    }

    public int getNumero_produto() {
        return numero_produto;
    }

    public float getValor_produto() {
        return valor_produto;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public int getQuantidade_produto() {
        return quantidade_produto;
    }
}
