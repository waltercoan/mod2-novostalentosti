package introducao.exercicio4;

import java.util.Date;

public class PessoaJuridica extends Pessoa{
    private Date dataCriacao;
    private String CNPJ;

    public Date getDataCriacao() {
        return dataCriacao;
    }
    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
    public String getCNPJ() {
        return CNPJ;
    }
    public void setCNPJ(String cNPJ) {
        CNPJ = cNPJ;
    }
}
