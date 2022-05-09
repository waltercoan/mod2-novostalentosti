package introducao;

import java.util.Calendar;
import java.util.GregorianCalendar;
import introducao.exercicio3.Comprador;
import introducao.exercicio3.ItemPedido;
import introducao.exercicio3.Pedido;
import introducao.exercicio3.Produto;

public class App6 {
    public static void main(String[] args) {
        Comprador zezinho = new Comprador();
        zezinho.setId(300);
        zezinho.setNome("Zezinho da Silva");
        zezinho.setEndereco("Rua Lalala 100");

        Pedido pedido1 = new Pedido();
        pedido1.setId(1);
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.set(2022, 04, 29);
        pedido1.setData(calendar.getTime());
        pedido1.setCliente(zezinho);

        var produto1 = new Produto();
        produto1.setId(1001);
        produto1.setNome("Playstation 5");
        produto1.setValor(8000f);
        
        var produto2 = new Produto();
        produto2.setId(1002);
        produto2.setNome("Xbox Series X");
        produto2.setValor(5000f);

        var item1 = new ItemPedido();
        item1.setId(1);
        item1.setQuantidade(1);
        item1.setValorVenda(7500f);
        item1.setProduto(produto1); //ligação entre ItemPedido e Produto
        pedido1.getListaItens().add(item1); //ligação entre Pedido e ItemPedido

        var item2 = new ItemPedido();
        item2.setId(2);
        item2.setQuantidade(1);
        item2.setValorVenda(4000f);
        item2.setProduto(produto2);
        pedido1.getListaItens().add(item2);


        var result = pedido1.calcValorTotal();
        System.out.println(String.format("O Total do pedido e: %.2f", result));
    }
}
