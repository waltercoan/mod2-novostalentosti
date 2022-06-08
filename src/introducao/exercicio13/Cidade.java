package introducao.exercicio13;

import java.util.ArrayList;

public class Cidade {
    private String nome;
    /*Coleção deve ser instanciada (criada) antes de conter qq coisa */
    private ArrayList<Municipe> listaMunicipes = new ArrayList<>();
        
    public String getNome() {
        return nome;
    }

    public ArrayList<Municipe> getListaMunicipes() {
        return listaMunicipes;
    }

    public void setListaMunicipes(ArrayList<Municipe> listaMunicipes) {
        this.listaMunicipes = listaMunicipes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public int contaApartamento(){
        int contador = 0;
        //1 criar um bloco de repetição para
        //acessar um municipe de cada vez
        //for( var_controle = val_ini ; condição ; incre/decre) { corpo }
        for(int i=0; i < listaMunicipes.size(); i++){
            //A cada volta eu tenho um municipe na variavel abaixo
            var umMunicipe = listaMunicipes.get(i);
            //TESTAR - o tipo da residencia dessa pessoa
            if(umMunicipe.getTipo().getNome().equals("Apartamento")){
                contador = contador + 1;
            }
        }
        return contador;
    }
    public int contaCasa(){
        int contador = 0;
        //FOR EACH - PARA CADA ELEMENTO
        for(var umMunicipe : listaMunicipes){
            if(umMunicipe.getTipo().getNome().equals("Casa")){
                contador++;
            }
        }
        return contador;
    }
    public static void main(String[] args) {
        Cidade cidade1 = new Cidade();
        cidade1.setNome("Joinville");

        Municipe mun1 = new Municipe();
        mun1.setNome("Zezinho");
        Municipe mun2 = new Municipe();
        mun2.setNome("Mariazinha");
        Municipe mun3 = new Municipe();
        mun3.setNome("Huguinho");
        Municipe mun4 = new Municipe();
        mun4.setNome("Astrogildo");
        Municipe mun5 = new Municipe();
        mun5.setNome("Luizinho");

        cidade1.getListaMunicipes().add(mun1);
        cidade1.getListaMunicipes().add(mun2);
        cidade1.getListaMunicipes().add(mun3);
        cidade1.getListaMunicipes().add(mun4);
        cidade1.getListaMunicipes().add(mun5);

        TipoResidencia tipo1 = new TipoResidencia();
        tipo1.setNome("Apartamento");
        TipoResidencia tipo2 = new TipoResidencia();
        tipo2.setNome("Casa");

        mun1.setTipo(tipo1);
        mun2.setTipo(tipo1);
        mun3.setTipo(tipo1);

        mun4.setTipo(tipo2);
        mun5.setTipo(tipo2);

        var numApart = cidade1.contaApartamento();
        System.out.println("Num Apartamentos: " + numApart);
        var numCasas = cidade1.contaCasa();
        System.out.println("Num Casas: " + numCasas);



    }
}