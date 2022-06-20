package introducao.exercicio18;

import java.util.ArrayList;

public class Setor {
    private String nome;
    private ArrayList<Produto> listaProdutos =
        new ArrayList<>();
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    }
    public void setListaProdutos(ArrayList<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }
    
}
