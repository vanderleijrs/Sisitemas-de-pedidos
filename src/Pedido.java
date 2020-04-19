import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Itens> itensList;
    private String codPedido;
    private CalculadorTotalDePedidos calculadorTotalDePedido;

    public Pedido(String codPedido) {
        this.itensList =new ArrayList();
        this.codPedido = codPedido;
        calculadorTotalDePedido = new CalculadorTotalDePedidos();

    }
    public String getCodPedido(){
        return codPedido;
    }
    public void addItem(Itens item){
        itensList.add(item);
    }
    public Double calcularTotalDeItens(){

        return calculadorTotalDePedido.calcularTotalDeItens(itensList);
    }
    public List<Itens> getItensList(){
        return itensList;
    }
}
