package introducao.exercicio15;

import java.util.ArrayList;

public class Vestibular{
    private ArrayList<Vestibulando> listaVestibulandos = 
        new ArrayList<>();

    public ArrayList<Vestibulando> getListaVestibulandos() {
        return listaVestibulandos;
    }

    public void setListaVestibulandos(ArrayList<Vestibulando> listaVestibulandos) {
        this.listaVestibulandos = listaVestibulandos;
    }
    
    public String gerarListaAprovados(){
        StringBuilder montadorTexto = new StringBuilder();
        for(var umVestibulando : listaVestibulandos){
            if(umVestibulando.getNota() >= 7){
                montadorTexto.append("Nome: " + umVestibulando.getNome() + "\n");
            }
        }
        return montadorTexto.toString();
    }
    public static void main(String[] args) {
        var acafe = new Vestibular();
        var vest1 = new Vestibulando();
        vest1.setNome("Zezinho");
        vest1.setNota(7);
        acafe.getListaVestibulandos().add(vest1);

        var vest2 = new Vestibulando();
        vest2.setNome("Pedrinho");
        vest2.setNota(5);
        acafe.getListaVestibulandos().add(vest2);

        var vest3 = new Vestibulando();
        vest3.setNome("Huguinho");
        vest3.setNota(10);
        acafe.getListaVestibulandos().add(vest3);

        var vest4 = new Vestibulando();
        vest4.setNome("Luizinho");
        vest4.setNota(8);
        acafe.getListaVestibulandos().add(vest4);

        String relatorio = acafe.gerarListaAprovados();
        System.out.println(relatorio);
    }
        
}