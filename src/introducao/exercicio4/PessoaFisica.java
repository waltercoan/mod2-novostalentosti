package introducao.exercicio4;

import java.util.Date;

public class PessoaFisica extends Pessoa {
    private Date dataNascimento;
    private String CPF;

    public Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }

    
}
