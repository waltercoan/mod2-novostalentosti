package introducao.exercicio16;

import java.util.ArrayList;

public class GuardaVolumes {
    private ArrayList<Item> listaItens = new ArrayList<>();
    
    public ArrayList<Item> getListaItens() {
        return listaItens;
    }
    public void setListaItens(ArrayList<Item> listaItens) {
        this.listaItens = listaItens;
    }
    public String gerarListaItens(){
        StringBuilder montador = new StringBuilder();

        for(var umItem : listaItens){
            montador.append("Item: " + umItem.getNome() + "\n");
            montador.append("Item: " + 
                umItem.getProprietario().getNome() + "\n");
        }

        return montador.toString();
    }
    public static void main(String[] args) {
        var guarda = new GuardaVolumes();
        var prop1 = new Proprietario();
        prop1.setNome("Zezinho");
        var prop2 = new Proprietario();
        prop2.setNome("Mariazinha");
        var item1 = new Item();
        item1.setNome("Chave de casa");
        item1.setProprietario(prop1);
        guarda.getListaItens().add(item1);

        var item2 = new Item();
        item2.setNome("Celular");
        item2.setProprietario(prop1);
        guarda.getListaItens().add(item2);

        var item3 = new Item();
        item3.setNome("Chave de casa");
        item3.setProprietario(prop2);
        guarda.getListaItens().add(item3);

        var item4 = new Item();
        item4.setNome("Celular");
        item4.setProprietario(prop2);
        guarda.getListaItens().add(item4);

        var item5 = new Item();
        item5.setNome("Carteira");
        item5.setProprietario(prop2);
        guarda.getListaItens().add(item5);

        var item6 = new Item();
        item6.setNome("Escova de cabelos");
        item6.setProprietario(prop2);
        guarda.getListaItens().add(item6);

        var relatorio = guarda.gerarListaItens();
        System.out.println(relatorio);



        
    }
}
