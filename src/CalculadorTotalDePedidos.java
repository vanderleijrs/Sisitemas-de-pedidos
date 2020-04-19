import java.util.List;

public class CalculadorTotalDePedidos {
    public Double calcularTotalDeItens(List<Itens> itensList){
        Double valorTotal=0.0;
        for(Itens item : itensList){
            valorTotal =valorTotal + item.getValor();
        }
        return valorTotal;
    }
}
