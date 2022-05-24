package introducao.exercicio7;

import java.util.ArrayList;

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
        return 0;
    }
    public float calcularMenorValor(){
        return 0;
    }
}