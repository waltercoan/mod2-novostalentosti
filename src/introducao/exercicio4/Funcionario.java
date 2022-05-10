package introducao.exercicio4;

public class Funcionario extends PessoaFisica{
    private String funcao;
    private long id;
    
    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
        
}
