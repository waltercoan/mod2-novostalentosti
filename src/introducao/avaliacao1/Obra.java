package introducao.avaliacao1;

import java.util.ArrayList;

public class Obra{
    private ArrayList<FaseDaObra> listaFases = 
        new ArrayList<>();

    public ArrayList<FaseDaObra> getListaFases() {
        return listaFases;
    }

    public void setListaFases(ArrayList<FaseDaObra> listaFases) {
        this.listaFases = listaFases;
    }

    public String listarDadosDaObra(){
        return null;
    }
    public float calcularValorTotalDaObra(){
        float valTot = 0;
        for(var umaFase : getListaFases()){
            valTot += umaFase.calcularValorDaFaseDaObra();
        }
        return valTot;
    }
    public float calcularValorTotalDaObrav2(){
        float valTot = 0;
        for(var umaFase : getListaFases()){
            valTot += umaFase.getEncarregado().getSalario();

            for(var umConstrutor : umaFase.getListaConstrutores()){
                valTot += umConstrutor.getSalario();
            }

            for(var umItem : umaFase.getListaItens()){
                var qtd = umItem.getQuantidade();
                var preco = umItem.getProduto().getPreco();
                valTot += (qtd * preco);
            }
        }
        return valTot;
    }
        
}