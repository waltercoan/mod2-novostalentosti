package introducao.exercicio7;

import java.util.ArrayList;

import javax.swing.event.ListDataEvent;

public class Planilha {

    private ArrayList<ContaDeLuz> listaContasDeLuz = new ArrayList<>();
    
    public ArrayList<ContaDeLuz> getListaContasDeLuz() {
        return listaContasDeLuz;
    }

    public void setListaContasDeLuz(ArrayList<ContaDeLuz> listaContasDeLuz) {
        this.listaContasDeLuz = listaContasDeLuz;
    }
    public float calcularUltimoValorMedio(){
        float soma = 0;
        float media = 0;
        for(int i=0;i<listaContasDeLuz.size();i++){
            ContaDeLuz umaConta = listaContasDeLuz.get(i);
            soma = soma + umaConta.getValorDaConta();
        }
        media = soma / listaContasDeLuz.size();
        return media;
    }
    public float calcularUltimoValorMediov2(){
        float soma = 0;
        float media = 0;
        for(ContaDeLuz umaConta : listaContasDeLuz){
            soma = soma + umaConta.getValorDaConta();
        }
        media = soma / listaContasDeLuz.size();
        return media;
    }
    public float calcularUltimoValorMediov3(){
        return (float)listaContasDeLuz.stream().mapToDouble(a -> a.getValorDaConta()).sum()
        / listaContasDeLuz.size();
    }

    public float calcularMaiorValor(){
        float omaior = 0;
        for(ContaDeLuz umaConta : listaContasDeLuz){
            if(omaior < umaConta.getValorDaConta()){
                omaior = umaConta.getValorDaConta();
            }
        }
        return omaior;
    }
    public float calcularMenorValor(){
        float omenor = 0;
        if(listaContasDeLuz.size() >= 1){ // verificar se existe pelo menos uma conta
            omenor = listaContasDeLuz.get(0).getValorDaConta();
        }
        for(ContaDeLuz umaConta : listaContasDeLuz){
            if(omenor > umaConta.getValorDaConta()){
                omenor = umaConta.getValorDaConta();
            }
        }
        return omenor;
    }
}