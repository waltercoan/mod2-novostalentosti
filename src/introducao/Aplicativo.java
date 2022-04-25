package introducao;

public class Aplicativo {
    //ENCAPSULAMENTO = atributo privado e metodo get/set publico
    private String nome;

    public Aplicativo(String nome) {
        setNome(nome);        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String toString(){
        return getNome();
    }
}
