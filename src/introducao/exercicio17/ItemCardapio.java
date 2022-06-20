package introducao.exercicio17;

public class ItemCardapio {
    private boolean disponivel;
    private Prato prato;

    public boolean isDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    public Prato getPrato() {
        return prato;
    }
    public void setPrato(Prato prato) {
        this.prato = prato;
    }
}
