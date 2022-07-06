package introducao.avaliacao1;

import java.util.ArrayList;

public class FaseDaObra {
    private String nome;
    private Engenheiro encarregado;
    private ArrayList<Construtor> listaConstrutores =
        new ArrayList<>();
    private ArrayList<ItemDeConstrucao> listaItens =
        new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public ArrayList<ItemDeConstrucao> getListaItens() {
        return listaItens;
    }

    public void setListaItens(ArrayList<ItemDeConstrucao> listaItens) {
        this.listaItens = listaItens;
    }

    public ArrayList<Construtor> getListaConstrutores() {
        return listaConstrutores;
    }

    public void setListaConstrutores(ArrayList<Construtor> listaConstrutores) {
        this.listaConstrutores = listaConstrutores;
    }

    public Engenheiro getEncarregado() {
        return encarregado;
    }

    public void setEncarregado(Engenheiro encarregado) {
        this.encarregado = encarregado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }    

    public float calcularValorDaFaseDaObra(){
        float valTotFase = 0;
        valTotFase += getEncarregado().getSalario();
        for(var umConstrutor : getListaConstrutores()){
            valTotFase += umConstrutor.getSalario();   
        }

        for(var umItem : getListaItens()){
            var qtd = umItem.getQuantidade();
            var preco = umItem.getProduto().getPreco();
            valTotFase += (qtd * preco);
        }

        return valTotFase;
    }
}
