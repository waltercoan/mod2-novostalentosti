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
        return 0;
    }
        
}