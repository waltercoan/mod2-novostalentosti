package introducao.exercicio1;

public class Livro {
    private String titulo;
    private float valor;
    private boolean esgotado;

    public Livro(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }


}
