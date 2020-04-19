public class PedidoComDesconto extends Pedido{
    private Double desconto;

    public PedidoComDesconto(String codPedido,Double desconto){
        super(codPedido);
        this.desconto = desconto;
    }
    @Override
    public Double calcularTotalDeItens(){
        Double valor =super.calcularTotalDeItens();
        valor = valor - desconto;
        return valor;
    }
}
