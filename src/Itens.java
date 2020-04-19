


public class Itens {

    private int id;
    private String categoria;
    private String descricao;
    private Double valor;


    public Itens(String descricao,Double valor,String categoria){
        this.descricao=descricao;
        this.valor=valor;
        this.categoria=categoria;
    }
    public Itens(String descricaoArg, Double valorArg) {
        this(descricaoArg,valorArg,"Sem Descricao");
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Item: " +
                " descricao='" + descricao + '\'' +
                ", categoria='" + categoria + '\'' +
                ", valor=" + valor +""
                ;
    }
}
