package introducao.exercicio6;

public class Vendedor extends Funcionario{
    private float percComissao;
    private float metaVenda;
    private EquipeDeVendas equipe;


    public EquipeDeVendas getEquipe() {
        return equipe;
    }
    public void setEquipe(EquipeDeVendas equipe) {
        this.equipe = equipe;
    }
    public float getPercComissao() {
        return percComissao;
    }
    public void setPercComissao(float percComissao) {
        this.percComissao = percComissao;
    }
    public float getMetaVenda() {
        return metaVenda;
    }
    public void setMetaVenda(float metaVenda) {
        this.metaVenda = metaVenda;
    }

    
}
