package introducao;

import java.util.Calendar;
import java.util.GregorianCalendar;

import introducao.exercicio5.Agenda;
import introducao.exercicio5.Agendamento;
import introducao.exercicio5.Medico;
import introducao.exercicio5.Paciente;

public class App8 {
    public static void main(String[] args) {
        var paciente1 = new Paciente();
        paciente1.setId(1);
        paciente1.setNome("Zezinho");
        paciente1.setTelefone("5555-1234");

        var paciente2 = new Paciente();
        paciente2.setId(2);
        paciente2.setNome("Luizinho");
        paciente2.setTelefone("5555-4321");

        var paciente3 = new Paciente();
        paciente3.setId(3);
        paciente3.setNome("Huguinho");
        paciente3.setTelefone("5555-1111");

        var paciente4 = new Paciente();
        paciente4.setId(4);
        paciente4.setNome("Pato Donald");
        paciente4.setTelefone("5555-2222");

        var medico1 = new Medico();
        medico1.setId(1);
        medico1.setNome("Nick Riviera");
        medico1.setCRM("1234");

        var medico2 = new Medico();
        medico2.setId(2);
        medico2.setNome("Doctor Hillbert");
        medico2.setCRM("5555");

        var agenda1 = new Agenda();
        agenda1.setId(1);
        agenda1.setMedico(medico1);
        
        var agenda2 = new Agenda();
        agenda2.setId(2);
        agenda2.setMedico(medico2);

        Calendar calendario = GregorianCalendar.getInstance();
        var agendamento1 = new Agendamento();
        agendamento1.setId(1);
        agendamento1.setMedico(medico1);
        agendamento1.setPaciente(paciente1);
        calendario.set(2022, 05, 19 , 13, 00);
        agendamento1.setDataHora(calendario.getTime());
        agenda1.getListaAgendamentos().add(agendamento1);

        var agendamento2 = new Agendamento();
        agendamento2.setId(2);
        agendamento2.setMedico(medico2);
        agendamento2.setPaciente(paciente1);
        calendario.set(2022, 05, 19 , 14, 00);
        agendamento2.setDataHora(calendario.getTime());
        agenda2.getListaAgendamentos().add(agendamento2);

        var agendamento3 = new Agendamento();
        agendamento3.setId(3);
        agendamento3.setMedico(medico1);
        agendamento3.setPaciente(paciente2);
        calendario.set(2022, 05, 19 , 15, 00);
        agendamento3.setDataHora(calendario.getTime());
        agenda1.getListaAgendamentos().add(agendamento3);

        var agendamento4 = new Agendamento();
        agendamento4.setId(4);
        agendamento4.setMedico(medico2);
        agendamento4.setPaciente(paciente2);
        calendario.set(2022, 05, 19 , 16, 00);
        agendamento4.setDataHora(calendario.getTime());
        agenda2.getListaAgendamentos().add(agendamento4);

        var agendamento5 = new Agendamento();
        agendamento5.setId(5);
        agendamento5.setMedico(medico1);
        agendamento5.setPaciente(paciente3);
        calendario.set(2022, 05, 19 , 17, 00);
        agendamento5.setDataHora(calendario.getTime());
        agenda1.getListaAgendamentos().add(agendamento5);

        var agendamento6 = new Agendamento();
        agendamento6.setId(6);
        agendamento6.setMedico(medico2);
        agendamento6.setPaciente(paciente3);
        calendario.set(2022, 05, 19 , 18, 00);
        agendamento6.setDataHora(calendario.getTime());
        agenda2.getListaAgendamentos().add(agendamento6);

        var agendamento7 = new Agendamento();
        agendamento7.setId(7);
        agendamento7.setMedico(medico1);
        agendamento7.setPaciente(paciente4);
        calendario.set(2022, 05, 19 , 19, 00);
        agendamento7.setDataHora(calendario.getTime());
        agenda1.getListaAgendamentos().add(agendamento7);

        var agendamento8 = new Agendamento();
        agendamento8.setId(8);
        agendamento8.setMedico(medico2);
        agendamento8.setPaciente(paciente4);
        calendario.set(2022, 05, 19 , 20, 00);
        agendamento8.setDataHora(calendario.getTime());
        agenda2.getListaAgendamentos().add(agendamento8);

        agenda1.imprimirAgenda();
        agenda2.imprimirAgenda();
    }
}
