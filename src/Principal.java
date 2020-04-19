import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.org.apache.xpath.internal.objects.XObjectFactory;

import static java.lang.System.*;

public class Principal {
    public static void main(String[] args) {
        Itens feijao = new Itens("Feijão",5.0,"alimento");
        Itens arroz = new Itens("Arroz",3.0,"alimento");
        Itens massa = new Itens("Massa",4.0,"alimento");
        Itens sal = new Itens("Sal",2.0,"alimento");
        Itens ovo = new Itens("Ovo",10.0,"alimento");

        String codPedido ="Primeiro pedido";
        Double desconto = 1.0;

        PedidoComDesconto pedido =new PedidoComDesconto(codPedido,desconto);

        pedido.addItem(feijao);
        pedido.addItem(arroz);
        pedido.addItem(massa);
        pedido.addItem(sal);
        pedido.addItem(ovo);

        out.println("Pedido: " +pedido.getCodPedido());

        for(Itens item : pedido.getItensList()){
            out.println(item);
        }


        out.println("Total Com Desconto: "+pedido.calcularTotalDeItens());

    }

}
