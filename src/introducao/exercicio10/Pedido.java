package introducao.exercicio10;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<Produto> listaProdutos = new ArrayList<>();

    public float calcSomaProdutos(){
        float total = 0;
        for(int i=0; i < getListaProdutos().size(); i++ ){
            total = total + getListaProdutos().get(i).getValor();
        }
        /*for(var umProduto : getListaProdutos()){
            total = total + umProduto.getValor();
        }*/
        /*
        total = getListaProdutos().stream().map(o->o.getValor()).reduce(0f, Float::sum);
        */
        
        return total;
    }
    public ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    }
    public void setListaProdutos(ArrayList<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido();
        
        Produto prod1 = new Produto();
        prod1.setNome("Banana");
        prod1.setValor(3.5f);
        pedido1.getListaProdutos().add(prod1);

        Produto prod2 = new Produto();
        prod2.setNome("Laranja");
        prod2.setValor(2.2f);
        pedido1.getListaProdutos().add(prod2);

        Produto prod3 = new Produto();
        prod3.setNome("Maça");
        prod3.setValor(7.2f);
        pedido1.getListaProdutos().add(prod3);

        Produto prod4 = new Produto();
        prod4.setNome("Pêra");
        prod4.setValor(25f);
        pedido1.getListaProdutos().add(prod4);
        
        float guardar = pedido1.calcSomaProdutos();
        System.out.println(guardar);
        //System.out.println(pedido1.calcSomaProdutos());

    }
}