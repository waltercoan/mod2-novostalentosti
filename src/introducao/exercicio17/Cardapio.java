package introducao.exercicio17;

import java.util.ArrayList;

public class Cardapio {
    private ArrayList<ItemCardapio> listaItensCardapio
        = new ArrayList<>();
        
    public String gerarCardapio(){
        StringBuilder montador = new StringBuilder();
        montador.append("Cardápio\n");
        for(var umItem : listaItensCardapio){
            if(umItem.isDisponivel()){
                var umPrato = umItem.getPrato();
                montador.append("\nNome: ");
                montador.append(umPrato.getNome());
                montador.append("\nPreço: ");
                montador.append(umPrato.getPreco());
            }
        }
        return montador.toString();
    }
    public ArrayList<ItemCardapio> getListaItensCardapio() {
        return listaItensCardapio;
    }
    public void setListaItensCardapio(ArrayList<ItemCardapio> 
            listaItensCardapio) {
        this.listaItensCardapio = listaItensCardapio;
    }
    public static void main(String[] args) {
        Cardapio card = new Cardapio();
        Prato prato1 = new Prato();
        prato1.setNome("Bifão");
        prato1.setPreco(10f);
        ItemCardapio item1 = new ItemCardapio();
        item1.setPrato(prato1);
        item1.setDisponivel(true);
        card.getListaItensCardapio().add(item1);

        Prato prato2 = new Prato();
        prato2.setNome("Feijoada");
        prato2.setPreco(30f);
        ItemCardapio item2 = new ItemCardapio();
        item2.setPrato(prato2);
        item2.setDisponivel(true);
        card.getListaItensCardapio().add(item2);

        Prato prato3 = new Prato();
        prato3.setNome("Dobradinha");
        prato3.setPreco(50f);
        ItemCardapio item3 = new ItemCardapio();
        item3.setPrato(prato3);
        item3.setDisponivel(false);
        card.getListaItensCardapio().add(item3);

        Prato prato4 = new Prato();
        prato4.setNome("Hamburguer");
        prato4.setPreco(20f);
        ItemCardapio item4 = new ItemCardapio();
        item4.setPrato(prato4);
        item4.setDisponivel(true);
        card.getListaItensCardapio().add(item4);

        String resultado = card.gerarCardapio();
        System.out.println(resultado);
    }
}
