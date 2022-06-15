package introducao.exercicio16;

public class Item {
    private String nome;
    private Proprietario proprietario;

    public String getNome() {
        return nome;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
