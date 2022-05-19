package introducao.exercicio5;

import java.util.Date;

public class Agendamento {
    private long id;
    private Date dataHora;
    private Paciente paciente;
    private Medico medico;

    
    public long getId() {
        return id;
    }
    public Medico getMedico() {
        return medico;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Date getDataHora() {
        return dataHora;
    }
    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    
}
