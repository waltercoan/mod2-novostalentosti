package sistema.entity;

import java.util.Date;

public class Cliente {
    private long id;
    private String nome;
    private String CPF;
    private Date dataNascimento;
    
    public Cliente() {
    }
    public Cliente(String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }
    public Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    
    
}
