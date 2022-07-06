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
        StringBuilder montador = new StringBuilder();
        for(var umFase : getListaFases()){
            montador.append("Fase: " + umFase.getNome() + "\n");
            montador.append("Nome Eng: " + umFase.getEncarregado().getNome() + "\n");
            montador.append("Numero Eng: " + umFase.getEncarregado().getNumero() + "\n");
            montador.append("Salario Eng: " + umFase.getEncarregado().getSalario() + "\n");
            montador.append("Formacao Eng: " + umFase.getEncarregado().getFormacao() + "\n");
            for(var umConstrutor : umFase.getListaConstrutores()){
                montador.append("Nome Cons: " + umConstrutor.getNome() + "\n");
                montador.append("Numero Cons: " + umConstrutor.getNumero() + "\n");
                montador.append("Salario Cons: " + umConstrutor.getSalario() + "\n");
                montador.append("Terceirizado Cons: " + umConstrutor.isTerceirizado() + "\n");
            }
            for(var umItem : umFase.getListaItens()){
                montador.append("Item Qtd: " + umItem.getQuantidade() + "\n");
                montador.append("Item Prod Nome: " + umItem.getProduto().getNome() + "\n");
                montador.append("Item Prod preco: " + umItem.getProduto().getPreco() + "\n");
            }
        }
        return montador.toString();
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