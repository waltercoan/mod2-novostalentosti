package introducao.exercicio1;

public class Livro {
    private String titulo;
    private float valor;
    private boolean esgotado;
    private Autor escritor;

    
    public String toString(){
        return "Titulo: " + getTitulo() + " Valor: " + getValor() +
            " Esgotado: " + isEsgotado() + " Autor Nome: " + getEscritor().getNome() +
            " Autor Data Nascimento " + getEscritor().getDataNascimento();
    }

    public Autor getEscritor() {
        return escritor;
    }

    public void setEscritor(Autor escritor) {
        this.escritor = escritor;
    }

    public Livro(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean isEsgotado() {
        return esgotado;
    }

    public void setEsgotado(boolean esgotado) {
        this.esgotado = esgotado;
    }
}
