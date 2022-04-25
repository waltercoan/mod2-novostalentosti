package introducao;



/**
 * @author Walter Silvestre Coan
 * O objetivo desta classe e armazenar os dados do celular
 */

//POJO - Plain old java object

import java.util.ArrayList;
public class Celular {
    private String numero;
    private String marca;
    private String modelo;
    private Pessoa dono;
    private ArrayList listaAplicativos = new ArrayList();

    

    public ArrayList getListaAplicativos() {
        return listaAplicativos;
    }

    public void setListaAplicativos(ArrayList listaAplicativos) {
        this.listaAplicativos = listaAplicativos;
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

    public Celular(String numero){
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
}
